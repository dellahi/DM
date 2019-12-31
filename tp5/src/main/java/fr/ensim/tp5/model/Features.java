package fr.ensim.tp5.model;

public class Features {
	
	private String type;
	 Geometry GeometryObject;
	 Properties PropertiesObject;


	 // Getter Methods 

	 public String getType() {
	  return type;
	 }

	 public Geometry getGeometry() {
	  return GeometryObject;
	 }

	 public Properties getProperties() {
	  return PropertiesObject;
	 }

	 // Setter Methods 

	 public void setType(String type) {
	  this.type = type;
	 }

	 public void setGeometry(Geometry geometryObject) {
	  this.GeometryObject = geometryObject;
	 }

	 public void setProperties(Properties propertiesObject) {
	  this.PropertiesObject = propertiesObject;
	 }
}
