package ua.com.clothes_shop.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.com.clothes_shop.dto.filter.SimpleFilter;
import ua.com.clothes_shop.entity.Image;

public interface ImageService {
	
void save(Image image);
	
	List<Image> findAll();
//	
//	Image findOne(int id);
//	
//	void delete(int id);
//	
//	void update (Image image);
//	
//	Page<Image> findAll(Pageable pageable, SimpleFilter filter);

}
