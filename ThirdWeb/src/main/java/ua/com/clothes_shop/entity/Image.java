package ua.com.clothes_shop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

//Означає що це сутність БД
@Entity
//для того щоб таблиці мали назву як і в БД
@Table(name="image")
public class Image {
	
	//Первинний ключ
	@Id
	//AUTO_INCTEMENT
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private int version; //якщо є форма, то треба це писати і в ентіті і у формі
	@Transient //пишемо для того, щоб це не записувалось в БД
	private MultipartFile file;
	
	@ManyToMany
	@JoinTable(name="item_image_connection",
	joinColumns=@JoinColumn(name="id_image"),
	inverseJoinColumns=@JoinColumn(name="id_item_of_clothing"))
	private List<ItemOfClothing> itemsOfClothing = new ArrayList<>();

	public List<ItemOfClothing> getItemsOfClothing() {
		return itemsOfClothing;
	}

	public void setItemsOfClothing(List<ItemOfClothing> itemsOfClothing) {
		this.itemsOfClothing = itemsOfClothing;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "Image [id=" + id + ", version=" + version + "]";
	}

}
