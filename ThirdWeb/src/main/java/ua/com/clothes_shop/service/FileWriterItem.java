package ua.com.clothes_shop.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileWriterItem {
	
	enum Folder{
		COLOR, CLOTHES //������, ��� �������� ����� color � �� ���� �����
	}
	
	//���� ���������� �������� ��'���� ���������� �� ���
	boolean write(Folder folder, MultipartFile file, int id, int itemId);

}
