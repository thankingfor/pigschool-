package com.pigschool.xyzshow.controller;

import com.pigschool.xyzshow.common.CommonStatus;
import com.pigschool.xyzshow.common.JsonReturn;
import com.pigschool.xyzshow.model.*;
import com.pigschool.xyzshow.service.IndexService;
import com.pigschool.xyzshow.service.LoginService;
import com.pigschool.xyzshow.service.SmService;
import com.pigschool.xyzshow.util.BzsyUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class IndexController {


    @RequestMapping(value = {"/fav/del"})
    public JsonReturn favdel(Long favId){
        int status = indexService.favdel(favId);
        if (status <= 0){
            return JsonReturn.fail(CommonStatus.FAULT);
        }
        return JsonReturn.success();
    }

    @RequestMapping(value = {"/exchange/del"})
    public JsonReturn exchangedel(Long changeId){
        int status = indexService.exchangedel(changeId);
        if (status <= 0){
            return JsonReturn.fail(CommonStatus.FAULT);
        }
        return JsonReturn.success();
    }

    @RequestMapping(value = {"/index","/"})
    public String index(Model model){
        /*轮播图 */
        List<XyzContent> listLUNBOTU = indexService.findContentByCID(LUNBOTU);
        model.addAttribute("listLUNBOTU",listLUNBOTU);
        /*最新发布*/
        List<XyzContent> listBESTNEW = indexService.findContentByCID(BESTNEW);
        model.addAttribute("listBESTNEW",listBESTNEW);
        /*精心编选*/
        List<XyzContent> listBIANJIJINGXUAN = indexService.findContentByCID(BIANJIJINGXUAN);
        model.addAttribute("listBIANJIJINGXUAN",listBIANJIJINGXUAN);
        /*平台低价*/
        List<XyzContent> listPINGTAIDIJIA = indexService.findContentByCID(PINGTAIDIJIA);
        model.addAttribute("listPINGTAIDIJIA",listPINGTAIDIJIA);
        /*优质成色*/
        List<XyzContent> listYOUZHICHENGSE = indexService.findContentByCID(YOUZHICHENGSE);
        model.addAttribute("listYOUZHICHENGSE",listYOUZHICHENGSE);
        /*SchoolBoard*/
        List<XyzContent> listSCHOOLBOARD = indexService.findContentByCID(SCHOOLBOARD);
        model.addAttribute("listSCHOOLBOARD",listSCHOOLBOARD);
        return "index";
    }

    @RequestMapping(value = {"/publish"})
    public String republic(){
        return "publish";
    }

    @RequestMapping(value = {"/user"})
    public String user(HttpSession session,Model model){
        XyzUser user = (XyzUser) session.getAttribute("user");
        List<XyzItem> itemList = indexService.findItemListByUserId(user.getId());
        model.addAttribute("itemList",itemList);
        /*我收藏的*/
        List<XyzFavorite> favoriteList = indexService.findFavoriteByUserId(user.getId());
        /*List<XyzItem> itemListFav = new ArrayList<>();
        for (XyzFavorite favorite :favoriteList) {
            XyzItem itemById = indexService.findItemById(favorite.getItemId());
            itemListFav.add(itemById);
        }*/
        model.addAttribute("favoriteList",favoriteList);
        /*我想要的*/
        List<XyzExchange> listExchange = indexService.findExchangeByUserId(user.getId());
        model.addAttribute("listExchange",listExchange);
        /*我发布的需求*/
        List<XyzNeed> xyzNeedList = smService.findNeedByUserId(user.getId());
        model.addAttribute("NeedList",xyzNeedList);
        List<XyzNeed> xyzNeedList1 = smService.findNeedByUserIdAndType(user.getId(),1);
        model.addAttribute("NeedList1",xyzNeedList1);
        List<XyzNeed> xyzNeedList2 = smService.findNeedByUserIdAndType(user.getId(),2);
        model.addAttribute("NeedList2",xyzNeedList2);
        List<XyzNeed> xyzNeedList3 = smService.findNeedByUserIdAndType(user.getId(),3);
        model.addAttribute("NeedList3",xyzNeedList3);
        /*接受的需求*/
        List<XyzNeedFav> needFavList1 = smService.findNeedFavByUserIdAndType(user.getId(),1);
        model.addAttribute("NeedFavList1",needFavList1);
        List<XyzNeedFav> needFavList11 = new ArrayList<>();
        List<XyzNeedFav> needFavList12 = new ArrayList<>();
        List<XyzNeedFav> needFavList13 = new ArrayList<>();
        for (XyzNeedFav fav:needFavList1) {
            if (fav.getNeed().getXyzType()==1) needFavList11.add(fav);
            if (fav.getNeed().getXyzType()==2) needFavList12.add(fav);
            if (fav.getNeed().getXyzType()==3) needFavList13.add(fav);
        }
        model.addAttribute("needFavList11",needFavList11);
        model.addAttribute("needFavList12",needFavList12);
        model.addAttribute("needFavList13",needFavList13);
        /*需求收藏*/
        List<XyzNeedFav> needFavList0 = smService.findNeedFavByUserIdAndType(user.getId(),0);
        model.addAttribute("NeedFavList0",needFavList0);
        List<XyzNeedFav> needFavList01 = new ArrayList<>();
        List<XyzNeedFav> needFavList02 = new ArrayList<>();
        List<XyzNeedFav> needFavList03 = new ArrayList<>();
        for (XyzNeedFav fav:needFavList0) {
            if (fav.getNeed().getXyzType()==1) needFavList01.add(fav);
            if (fav.getNeed().getXyzType()==2) needFavList02.add(fav);
            if (fav.getNeed().getXyzType()==3) needFavList03.add(fav);
        }
        model.addAttribute("needFavList01",needFavList01);
        model.addAttribute("needFavList02",needFavList02);
        model.addAttribute("needFavList03",needFavList03);
        return "user";
    }

    @ResponseBody
    @RequestMapping(value = {"/user/edit"})
    public JsonReturn useredit(XyzUser user, Model model,HttpSession session){
        int status = indexService.useredit(user);
        if (BzsyUtils.isEmpty(status))
            return JsonReturn.fail(CommonStatus.FAULT);
        XyzUser byUsername = loginService.findByUsername(user);
        session.setAttribute("user",byUsername);
        return JsonReturn.success();
    }

    @ResponseBody
    @RequestMapping(value = {"/item/Nofavorite"})
    public JsonReturn itemNofavorite(XyzFavorite favorite, Model model){
        log.info(favorite.toString());
        int status = indexService.itemNofavorite(favorite);
        if (BzsyUtils.isEmpty(status))
            return JsonReturn.fail(CommonStatus.FAULT);
        return JsonReturn.success();
    }

    @ResponseBody
    @RequestMapping(value = {"/item/favorite"})
    public JsonReturn itemfavorite(XyzFavorite favorite, Model model){
        int status = indexService.itemfavorite(favorite);
        if (BzsyUtils.isEmpty(status))
            return JsonReturn.fail(CommonStatus.FAULT);
        return JsonReturn.success();
    }

    @ResponseBody
    @RequestMapping(value = {"/leave/message"})
    public JsonReturn leavemessage(XyzMessage message, Model model){
        log.info(message.toString());
        int status = indexService.leavemessage(message);
        if (BzsyUtils.isEmpty(status))
            return JsonReturn.fail(CommonStatus.FAULT);
        return JsonReturn.success();
    }

    @ResponseBody
    @RequestMapping(value = {"/Noiwant"})
    public JsonReturn Noiwant(XyzExchange exchange, Model model){
        int status = indexService.Noiwant(exchange);
        if (BzsyUtils.isEmpty(status))
            return JsonReturn.fail(CommonStatus.FAULT);
        return JsonReturn.success();
    }

    @ResponseBody
    @RequestMapping(value = {"/iwant"})
    public JsonReturn iwant(XyzExchange exchange, Model model){
        int status = indexService.iwangt(exchange);
        if (BzsyUtils.isEmpty(status))
            return JsonReturn.fail(CommonStatus.FAULT);
        return JsonReturn.success();
    }

    @RequestMapping(value = {"/item/{path}"})
    public String republic(@PathVariable Long path,Model model,HttpSession Session){
        XyzItem item = indexService.findItemById(path);
        if (item.getUid() == null){
            item.setUid(1L);
        }
        XyzUser user = indexService.findUserByUid(item.getUid());
        /*商品*/
        model.addAttribute("item",item);
        /*商品用户*/
        model.addAttribute("itemUser",user);
        /*图片处理*/
        if (BzsyUtils.isNotEmpty(item.getImage())){
            String[] images = item.getImage().split(",");
            model.addAttribute("images",images);
        }
        /*留言*/
        List<XyzMessage>  messageList =  indexService.findMessage(path);
        model.addAttribute("messageList",messageList);
        /*收藏 根据itemid 和 userid 返回数据*/ /*我想要 的处理*/
        XyzUser user1 = (XyzUser) Session.getAttribute("user");
        if (BzsyUtils.isNotEmpty(user1)){
            /*收藏 根据itemid 和 userid 返回数据*/
            XyzFavorite favorite = indexService.findFavoriteByUserIdAndItemId(user1.getId(),item.getId());
            if (BzsyUtils.isNotEmpty(favorite)){
                model.addAttribute("favorite",favorite);
                model.addAttribute("IdFavorite","已收藏");
            } else {
                model.addAttribute("IdFavorite","先收藏");
            }
            /*我想要 的处理*/
            XyzExchange exchange = indexService.findExchangeByUserIdAndItemId(user1.getId(),item.getId());
            if (BzsyUtils.isNotEmpty(exchange)){
                model.addAttribute("exchange",exchange);
                model.addAttribute("Isexchange","已交换");
            } else {
                model.addAttribute("Isexchange","我想要");
            }
            /*我想要 的处理*/
        } else {
            model.addAttribute("IdFavorite","先收藏");
            model.addAttribute("Isexchange","我想要");
        }
        /**/
        return "item";
    }

    @RequestMapping(value = {"/search"})
    public String search(@RequestParam(defaultValue = "") String param, Model model){
        List<XyzItem> list = indexService.searchItem(param);
        log.info("itemlist="+list);
        model.addAttribute("ItemList",list);
        return "search";
    }

    @ResponseBody
    @RequestMapping(value = {"/publish/item"},method = RequestMethod.POST)
    public JsonReturn upItem(XyzItem item, HttpSession session){
        log.info(item.toString());
        XyzUser user = (XyzUser) session.getAttribute("user");
        if (BzsyUtils.isEmpty(user)){
            return JsonReturn.fail(CommonStatus.FAULT);
        }
        item.setUid(user.getId());
        return indexService.upItem(item);
    }

    @Autowired
    private SmService smService;

    @Autowired
    private LoginService loginService;

    @Autowired
    private IndexService indexService;

    @Value("${LUNBOTU}")
    private Long LUNBOTU;
    @Value("${BESTNEW}")
    private Long BESTNEW;
    @Value("${BIANJIJINGXUAN}")
    private Long BIANJIJINGXUAN;
    @Value("${PINGTAIDIJIA}")
    private Long PINGTAIDIJIA;
    @Value("${YOUZHICHENGSE}")
    private Long YOUZHICHENGSE;
    @Value("${SCHOOLBOARD}")
    private Long SCHOOLBOARD;
}
