package tr.com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="KULLANICI")
@SequenceGenerator(name="kullanici_seq", sequenceName="kullanici_id_seq")
public class Kullanici{

	@Id
	@GeneratedValue(generator="kullanici_seq", strategy=GenerationType.SEQUENCE)
	@Column(name="ID")
	private Long id;
	
	@Column(name="ADI")
	private String name;
	
	@Column(name="GOREV")
	private Long gorev;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getGorev() {
		return gorev;
	}

	public void setGorev(Long gorev) {
		this.gorev = gorev;
	}
	
	
	
}
