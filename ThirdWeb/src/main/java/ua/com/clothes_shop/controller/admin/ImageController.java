//package ua.com.clothes_shop.controller.admin;
//
//import static ua.com.clothes_shop.util.ParamBuilder.getParams;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.web.PageableDefault;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.SessionAttributes;
//
//import ua.com.clothes_shop.dto.filter.SimpleFilter;
//import ua.com.clothes_shop.entity.Image;
//import ua.com.clothes_shop.service.ImageService;
//
//@Controller
//@RequestMapping("/admin/image")
//@SessionAttributes("image")
//public class ImageController {
//	
//	@Autowired
//	private ImageService imageService;
//	
//	@ModelAttribute("image")
//	public Image getForm(){
//		return new Image();
//	}
//	
//	@ModelAttribute("filter")
//	 	public SimpleFilter getFilter(){
//	 		return new SimpleFilter();
//	 	}
//	
////	@GetMapping
////	public String show(Model model, @PageableDefault Pageable pageable, @ModelAttribute("filter") SimpleFilter filter){
////		model.addAttribute("page", imageService.findAll(pageable, filter));
////		return "admin-image";
////	}
//	@GetMapping
//	public String show(Model model){
//		model.addAttribute("images", imageService.findAll());
//		return "admin-image";
//	}
//	
////	@GetMapping("/update/{id}")
////	public String update(@PathVariable int id, Model model, @PageableDefault Pageable pageable, @ModelAttribute("filter") SimpleFilter filter){
////		model.addAttribute("image", imageService.findOne(id));
////		return show(model, pageable, filter);
////	}
////
////	@GetMapping("/delete/{id}")
////	public String delete(@PathVariable int id, @PageableDefault Pageable pageable, @ModelAttribute("filter") SimpleFilter filter){
////			imageService.delete(id);
////			return "redirect:/admin/image"+getParams(pageable, filter);
////		}
////		
////	@PostMapping
////	public String save(@ModelAttribute("image") Image image, @PageableDefault Pageable pageable, @ModelAttribute("filter") SimpleFilter filter){
////		imageService.save(image);
////		return "redirect:/admin/image"+getParams(pageable, filter);
////	}
//
//}
