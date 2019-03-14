package com.pigschool.xyzshow.controller;

import com.pigschool.xyzshow.common.CommonStatus;
import com.pigschool.xyzshow.common.JsonReturn;
import com.pigschool.xyzshow.model.XyzContent;
import com.pigschool.xyzshow.model.XyzNeed;
import com.pigschool.xyzshow.model.XyzNeedFav;
import com.pigschool.xyzshow.service.IndexService;
import com.pigschool.xyzshow.service.LoginService;
import com.pigschool.xyzshow.service.SmService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 供需
 * @author lyf
 * @create 2019-03-09 18:00
 */
@Slf4j
@Controller
@RequestMapping("/sm")
public class SmController {

    @RequestMapping(value = {"/accepter/{needId}"})
    public String accepter(@PathVariable Long needId, Model model){
        List<XyzNeedFav> favList = smService.findNeedFavByNeedIdAndType(needId,1);
        model.addAttribute("favList",favList);
        return "/sm/accepter";
    }

    @ResponseBody
    @RequestMapping(value = {"/need/fav/del"})
    public JsonReturn needfavdel(Long favId, Model model){
        int status = smService.needfavdel(favId);
        if (status <=0 ) return JsonReturn.fail(CommonStatus.FAULT);
        return JsonReturn.success();
    }

    @ResponseBody
    @RequestMapping(value = {"/need/fav"})
    public JsonReturn sm(XyzNeedFav needFav, Model model){
        int status = smService.insertFav(needFav);
        if (status <=0 ) return JsonReturn.fail(CommonStatus.FAULT);
        return JsonReturn.success();
    }

    @RequestMapping(value = {"/{needId}"})
    public String sm(@PathVariable Long needId,Model model){
        XyzNeed need = smService.findNeedById(needId);
        model.addAttribute("need",need);
        return "/sm/detail";
    }

    @RequestMapping(value = {"/work"})
    public String work(Model model){
        List<XyzNeed> list = smService.findNeedByType(2);
        model.addAttribute("list",list);
        return "/sm/work";
    }

    @RequestMapping(value = {"/multiple"})
    public String multiple(Model model){
        List<XyzNeed> list = smService.findNeedByType(3);
        model.addAttribute("list",list);
        return "/sm/multiple";
    }

    @RequestMapping(value = {"/single"})
    public String single(Model model){
        List<XyzNeed> list = smService.findNeedByType(1);
        model.addAttribute("list",list);
        return "/sm/single";
    }

    @RequestMapping(value = {"","/index"})
    public String smIndex(Model model){
        /*轮播图 */
        List<XyzContent> listSMLUNBOTU = indexService.findContentByCID(SMLUNBOTU);
        model.addAttribute("listSMLUNBOTU",listSMLUNBOTU);
        log.info(listSMLUNBOTU.toString());
        /*单人 */
        List<XyzContent> listXUQIU = indexService.findContentByCID(XUQIU);
        List<XyzNeed> needXUQIU = new ArrayList<>();
        for (XyzContent content:listXUQIU) {
            XyzNeed need = smService.findNeedById(Long.valueOf(content.getTitle()));
            needXUQIU.add(need);
        }
        model.addAttribute("needXUQIU",needXUQIU);
        model.addAttribute("listXUQIU",listXUQIU);
        /*work */
        List<XyzContent> listJIANZHI = indexService.findContentByCID(JIANZHI);
        List<XyzNeed> needJIANZHI = new ArrayList<>();
        for (XyzContent content:listJIANZHI) {
            XyzNeed need = smService.findNeedById(Long.valueOf(content.getTitle()));
            needJIANZHI.add(need);
        }
        model.addAttribute("needJIANZHI",needJIANZHI);
        model.addAttribute("listJIANZHI",listJIANZHI);
        /*众包 */
        List<XyzContent> listZHONGBAO = indexService.findContentByCID(ZHONGBAO);
        List<XyzNeed> needZHONGBAO = new ArrayList<>();
        for (XyzContent content:listZHONGBAO) {
            XyzNeed need = smService.findNeedById(Long.valueOf(content.getTitle()));
            needZHONGBAO.add(need);
        }
        model.addAttribute("needZHONGBAO",needZHONGBAO);
        model.addAttribute("listZHONGBAO",listZHONGBAO);
        return "/sm/index";
    }

    @RequestMapping("/publish")
    public String publish(){

        return "/sm/publish";
    }

    @RequestMapping("/search")
    public String search(@RequestParam(defaultValue = "")String param, Model model){
        List<XyzNeed> list = smService.search(param);
        log.info(list.toString());
        List<XyzNeed> list1 = new ArrayList<>();
        List<XyzNeed> list2 = new ArrayList<>();
        List<XyzNeed> list3 = new ArrayList<>();
        for (XyzNeed need: list) {
            if (need.getXyzType() == 1) list1.add(need);
            if (need.getXyzType() == 2) list2.add(need);
            if (need.getXyzType() == 3) list3.add(need);
        }
        model.addAttribute("needList1",list1);
        model.addAttribute("needList2",list2);
        model.addAttribute("needList3",list3);
        return "/sm/search";
    }

    @RequestMapping("/publish/insert")
    public String publishinsert(XyzNeed need){
        log.info("need="+need);
        int status = smService.publishInsert(need);
        return "/sm/publish";
    }

    @Autowired
    private SmService smService;

    @Autowired
    private LoginService loginService;

    @Autowired
    private IndexService indexService;

    @Value("${SMLUNBOTU}")
    private Long SMLUNBOTU;

    @Value("${XUQIU}")
    private Long XUQIU;

    @Value("${JIANZHI}")
    private Long JIANZHI;

    @Value("${ZHONGBAO}")
    private Long ZHONGBAO;
}
