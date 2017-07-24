package com.entity.bouquet;

import java.util.List;
import java.util.Set;

import com.entity.accessory.Accessory;
import com.entity.plant.Plant;

public class Bouquet {

	private Price price;
	private BouquetType type;
	private Steam steam;
	private Size size;
	private Condition condition;
	private List<Plant> plants;
	private Set<Accessory> accessories;

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public BouquetType getType() {
		return type;
	}

	public void setType(BouquetType type) {
		this.type = type;
	}

	public Steam getSteam() {
		return steam;
	}

	public void setSteam(Steam steam) {
		this.steam = steam;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public List<Plant> getPlants() {
		return plants;
	}

	public void setPlants(List<Plant> plants) {
		this.plants = plants;
	}

	public Set<Accessory> getAccessories() {
		return accessories;
	}

	public void setAccessories(Set<Accessory> accessories) {
		this.accessories = accessories;
	}

}
