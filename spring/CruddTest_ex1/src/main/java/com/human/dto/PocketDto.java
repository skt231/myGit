package com.human.dto;

public class PocketDto {
String name;
int knife;
int pencil;
int ballpen;
public PocketDto(String name, int knife, int pencil, int ballpen) {
	super();
	this.name = name;
	this.knife = knife;
	this.pencil = pencil;
	this.ballpen = ballpen;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ballpen;
	result = prime * result + knife;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + pencil;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	PocketDto other = (PocketDto) obj;
	if (ballpen != other.ballpen)
		return false;
	if (knife != other.knife)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (pencil != other.pencil)
		return false;
	return true;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getKnife() {
	return knife;
}
public void setKnife(int knife) {
	this.knife = knife;
}
public int getPencil() {
	return pencil;
}
public void setPencil(int pencil) {
	this.pencil = pencil;
}
public int getBallpen() {
	return ballpen;
}
public void setBallpen(int ballpen) {
	this.ballpen = ballpen;
}
@Override
public String toString() {
	return "pocketDto [name=" + name + ", knife=" + knife + ", pencil=" + pencil + ", ballpen=" + ballpen + "]";
}
}
