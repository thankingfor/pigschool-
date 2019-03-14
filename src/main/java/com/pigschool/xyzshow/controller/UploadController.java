package com.pigschool.xyzshow.controller;

import com.pigschool.xyzshow.common.CommonStatus;
import com.pigschool.xyzshow.common.JsonReturn;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Controller
public class UploadController {


    @Value("${LOCALTION_PATH}")
    private String LOCALTION_PATH;

    @ResponseBody
    @RequestMapping("/upload")
    public JsonReturn uplaod(HttpServletRequest req, @RequestParam("smfile") MultipartFile file, Model model){
        //1. 接受上传的文件  @RequestParam("file") MultipartFile file
        try {
            //2.根据时间戳创建新的文件名，这样即便是第二次上传相同名称的文件，也不会把第一次的文件覆盖了
            String fileName = System.currentTimeMillis() + file.getOriginalFilename();

            //3.通过req.getServletContext().getRealPath("") 获取当前项目的真实路径，然后拼接前面的文件名
            //String destFileName = req.getServletContext().getRealPath("") + "uploaded" + File.separator + fileName;
            String destFileName = LOCALTION_PATH+fileName;
            log.info(destFileName);
            log.info(LOCALTION_PATH);
            log.info(fileName);
            //4.第一次运行的时候，这个文件所在的目录往往是不存在的，这里需要创建一下目录（创建到了webapp下uploaded文件夹下）
            File destFile = new File(destFileName);
            destFile.getParentFile().mkdirs();
            //5.把浏览器上传的文件复制到希望的位置
            file.transferTo(destFile);
            //6.把文件名放在model里，以便后续显示用
            Map<String ,Object> map = new HashMap<>();
            map.put("url",destFileName);
            map.put("fileName",fileName);
            return JsonReturn.success(map);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return JsonReturn.fail(CommonStatus.FAULT);
    }
}
