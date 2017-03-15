package ua.com.clothes_shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import ua.com.clothes_shop.entity.Image;

public interface ImageDao extends JpaRepository<Image, Integer>, JpaSpecificationExecutor<Image>{

}
