package jp.co.systena.tigerscave.shopping.application.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.tigerscave.shopping.application.model.ListService;

@Controller  // Viewあり。Viewを返却するアノテーション
public class ShoppingController {

  @Autowired
  HttpSession session;                  // セッション管理
  @RequestMapping(value="/shop", method = RequestMethod.GET)          // URLとのマッピング
  public ModelAndView index(ModelAndView mav) {
    // Viewに渡すデータを設定
    // セッション情報から保存したデータを取得してメッセージを生成
//    ProductForm productForm = (ProductForm) session.getAttribute("form");
//    session.removeAttribute("form");
//    if (productForm != null) {
//      mav.addObject("message", productForm.getName()+"を保存しました");
//    }
    mav.addObject("productForm", new ListService());  // 新規クラスを設定

//    List<User> users = (List<User>) session.getAttribute("userList");
//    if( users == null) {
//        users = new ArrayList<User>();
//        session.setAttribute("userList", users);
//    }
//    mav.addObject("users", users);

    BindingResult bindingResult = (BindingResult) session.getAttribute("result");
//    if (bindingResult != null) {
//      mav.addObject("bindingResult", bindingResult);
//    }
    // Viewのテンプレート名を設定
    mav.setViewName("shop");
    return mav;
  }
//  @RequestMapping(value="/shop", method = RequestMethod.POST)  // URLとのマッピング
//  private ModelAndView adduser(ModelAndView mav, @Valid ProductForm productForm, BindingResult bindingResult, HttpServletRequest request) {

//    List<User> users = (List<User>)session.getAttribute("userList");
//    if( users == null) {
//        users = new ArrayList<User>();
//        session.setAttribute("userList", users);
//    }
//
//    if (bindingResult.getAllErrors().size() > 0) {
//      // エラーがある場合はそのまま戻す
//      mav.addObject("productForm",productForm);  // 新規クラスを設定
//
//      mav.addObject("users", users);
//
//      // Viewのテンプレート名を設定
//      mav.setViewName("shop");
//      return mav;
//
//    }
//    User user = new User();
//    user.setName(productForm.getName());
//    users.add(user);
    // データをセッションへ保存
//    session.setAttribute("form", productForm);
//    return new ModelAndView("redirect:/userlist");        // リダイレクト
//  }
}
