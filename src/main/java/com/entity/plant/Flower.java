package com.entity.plant;

public class Flower extends Plant {

	private FlowerType type;
	private boolean needFeed;
	private boolean needSupport;

	public FlowerType getType() {
		return type;
	}

	public void setType(FlowerType type) {
		this.type = type;
	}

	public boolean isNeedFeed() {
		return needFeed;
	}

	public void setNeedFeed(boolean needFeed) {
		this.needFeed = needFeed;
	}

	public boolean isNeedSupport() {
		return needSupport;
	}

	public void setNeedSupport(boolean needSupport) {
		this.needSupport = needSupport;
	}

}
