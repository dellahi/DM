package fr.ensim.tp5.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
		@Id
		@GeneratedValue
		private Long id;
		private Date creation ;
		private String content ;
		private String auteur ;
		public Date getCreation() {
			return creation;
		}
		public void setCreation(Date creation) {
			this.creation = creation;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getAuteur() {
			return auteur;
		}
		public void setAuteur(String auteur) {
			this.auteur = auteur;
		}
}