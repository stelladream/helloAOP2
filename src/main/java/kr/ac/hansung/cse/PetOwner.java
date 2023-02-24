package kr.ac.hansung.cse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class PetOwner {

    @Autowired
    @Qualifier("qf_cat")
    public AnimalType animal;

	/*
	public PetOwner(AnimalType animal) {
		this.animal = animal;
	} */

    /*    public void setAnimal(AnimalType animal) {
        this.animal = animal;
    }*/

    public void play() {
        animal.sound();
    }

}
