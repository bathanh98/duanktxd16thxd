package controller;

import entity.SoBoDuAn;
import NVP.NPV;
import entity.TongDuAn;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import service.ChiTietDuAnService;
import service.TongDuAnService;
import service.SoLieuDoanhThuService;
import org.springframework.beans.factory.annotation.Autowired;
import service.VonDauTuService;
import org.springframework.stereotype.Controller;

@Controller("/")
public class DuAnController
{
    @Autowired
    private VonDauTuService vonDauTuService;
    @Autowired
    private SoLieuDoanhThuService doanhThuService;
    @Autowired
    private TongDuAnService duAnService;
    @Autowired
    private ChiTietDuAnService chiTietDuAnService;
    
    @RequestMapping(method = { RequestMethod.GET })
    public String index(final Model model) {
        return "index";
    }
    
    @RequestMapping(method = { RequestMethod.GET }, value = { "duan" })
    public String getListVonDauTu(final Model model, @RequestParam(name = "id") final int id, final HttpSession session) {
        final TongDuAn duAn = this.duAnService.getDuAnById(id);
        session.setAttribute("duan", (Object)duAn);
        return this.getNPV(model, session);
    }
    
    @RequestMapping(method = { RequestMethod.GET }, value = { "npv" })
    public String getNPV(final Model model, final HttpSession session) {
        final TongDuAn duAn = (TongDuAn)session.getAttribute("duan");
        final NPV npv = new NPV(duAn);
        model.addAttribute("npv", (Object)npv);
        if (duAn == null) {
            return "index";
        }
        return "npv";
    }
    
    @RequestMapping(method = { RequestMethod.GET }, value = { "irr" })
    public String getIRR(final Model model, final HttpSession session) {
        final TongDuAn duAn = (TongDuAn)session.getAttribute("duan");
        final NPV npv = new NPV(duAn);
        model.addAttribute("irr", (Object)npv.getIrr());
        if (duAn == null) {
            return "index";
        }
        return "irr";
    }
    
    @RequestMapping(method = { RequestMethod.GET }, value = { "bcr" })
    public String getBCR(final Model model, final HttpSession session) {
        final TongDuAn duAn = (TongDuAn)session.getAttribute("duan");
        final NPV npv = new NPV(duAn);
        if (duAn == null) {
            return "index";
        }
        model.addAttribute("npv", (Object)npv);
        return "bcr";
    }
    
    @RequestMapping(method = { RequestMethod.GET }, value = { "pp" })
    public String getPp(final Model model, final HttpSession session) {
        final TongDuAn duAn = (TongDuAn)session.getAttribute("duan");
        final NPV npv = new NPV(duAn);
        model.addAttribute("npv", (Object)npv);
        model.addAttribute("listpvtichluy", (Object)npv.getListPVTichLuy());
        if (duAn == null) {
            return "index";
        }
        return "pp";
    }
    
    @RequestMapping(method = { RequestMethod.GET }, value = { "danhgiaduan" })
    public String getDanhGiaDuAn(final Model model, final HttpSession session) {
        final TongDuAn duAn = (TongDuAn)session.getAttribute("duan");
        final NPV npv = new NPV(duAn);
        model.addAttribute("npv", (Object)npv);
        if (duAn == null) {
            return "index";
        }
        return "danhgiaduan";
    }
    
    @RequestMapping(method = { RequestMethod.GET }, value = { "doanhthu" })
    public String doanhThu(final Model model, final HttpSession session) {
        final TongDuAn duAn = (TongDuAn)session.getAttribute("duan");
        model.addAttribute("duan", (Object)duAn);
        if (duAn == null) {
            return "index";
        }
        return "doanhthu";
    }
    
    @RequestMapping(method = { RequestMethod.GET }, value = { "chiphi" })
    public String chiPhi(final Model model, final HttpSession session) {
        final TongDuAn duAn = (TongDuAn)session.getAttribute("duan");
        if (duAn == null) {
            return "index";
        }
        model.addAttribute("duan", (Object)duAn);
        return "chiphi";
    }
    
    @RequestMapping(method = { RequestMethod.GET }, value = { "vondautu" })
    public String vonDauTu(final Model model, final HttpSession session) {
        final TongDuAn duAn = (TongDuAn)session.getAttribute("duan");
        model.addAttribute("vondautu", (Object)duAn.getVonDauTu());
        if (duAn == null) {
            return "index";
        }
        return "vondautu";
    }
    
    @RequestMapping(method = { RequestMethod.GET }, value = { "newduansobo" })
    public String newSoBoDuAn(final Model model, final HttpSession session) {
        session.setAttribute("duan", (Object)null);
        final SoBoDuAn duAn = new SoBoDuAn();
        model.addAttribute("soboduan", (Object)duAn);
        return "newduansobo";
    }
    
    @RequestMapping(method = { RequestMethod.POST }, value = { "soboduan" })
    public String SoBoDuAn(final SoBoDuAn soBoDuAn, final Model model) {
        TongDuAn duAn = this.duAnService.saveSoBoDuAn(soBoDuAn);
        duAn = this.duAnService.getDuAnById(duAn.getId());
        model.addAttribute("duan", (Object)duAn);
        return "newduanchitiet";
    }
    
    @RequestMapping(method = { RequestMethod.POST }, value = { "saveduan" })
    public String saveDuAn(TongDuAn duAn, final Model model, final HttpSession session) {
        duAn = this.duAnService.saveDuAn(duAn);
        session.setAttribute("duan", (Object)duAn);
        model.addAttribute("duan", (Object)duAn);
        return "redirect:/danhgiaduan";
    }
    
    @RequestMapping(method = { RequestMethod.GET }, value = { "thoat" })
    public String thoat(final Model model, final HttpSession session) {
        session.setAttribute("duan", (Object)null);
        return "index";
    }
    
    @RequestMapping(method = { RequestMethod.GET }, value = { "editduan" })
    public String editduan(final Model model, final HttpSession session) {
        try {
            final TongDuAn duAn = (TongDuAn)session.getAttribute("duan");
            model.addAttribute("duan", (Object)duAn);
        }
        catch (Exception e) {
            return "index";
        }
        return "newduanchitiet";
    }
}