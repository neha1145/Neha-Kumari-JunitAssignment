package com.epam.design_pattern;
import java.io.*;

abstract class animal_factory {
	abstract String getAnimal();
}
class SeaAnimal extends animal_factory{
	public String getAnimal() {
		return "Sea-Animal";
	}
}
class LandAnimal extends animal_factory{
	public String getAnimal() {
		return "Land-Animal";
	}
}
class animal{
	public animal_factory getanimal_factory(String animal_type) {
		if(animal_type==null)
		{
			return null;
		}
		if(animal_type.equalsIgnoreCase("Fish"))
        {
          return new SeaAnimal();
        } 
		else
        {
          return new LandAnimal();
        } 
	}
}