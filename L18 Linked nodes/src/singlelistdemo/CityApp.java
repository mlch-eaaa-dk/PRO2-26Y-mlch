package singlelistdemo;

public class CityApp {
    void main() {
        City paris = new City("Paris");
        City london = new City("London");
        City amsterdam = new City("Amsterdam");
        City rom = new City("Rome");

        IO.println("Tests on EMPTY list:");
        IO.println();

        CityList cityList = new CityList();
        IO.println("cityList = " + cityList);
        IO.println();

        City city = cityList.removeFirst();
        if (city == null) IO.println("Nothing removed from the list");
        else IO.println("Removed: " + city);
        IO.println("cityList = " + cityList);
        IO.println();

        boolean inList = cityList.contains(paris);
        if (!inList) IO.println("Paris is NOT in the list");
        else IO.println("Paris is in the list");
        IO.println("cityList = " + cityList);
        IO.println();

        boolean isRemoved = cityList.remove(paris);
        if (!isRemoved) IO.println("Paris is NOT removed from the list");
        else IO.println("Paris removed");
        IO.println("cityList = " + cityList);
        IO.println();

        //-------------------------------------------------

        IO.println("Tests on list with ONE city:");
        IO.println();

        cityList.add(paris);
        IO.println("cityList = " + cityList);
        IO.println();

        city = cityList.removeFirst();
        if (city == null) IO.println("Nothing removed from the list");
        else IO.println("Removed: " + city);
        IO.println("cityList = " + cityList);
        IO.println();

        cityList.add(paris);
        IO.println("cityList = " + cityList);
        IO.println();

        inList = cityList.contains(paris);
        if (!inList) IO.println("Paris is NOT in the list");
        else IO.println("Paris is in the list");
        IO.println("cityList = " + cityList);
        IO.println();

        isRemoved = cityList.remove(paris);
        if (!isRemoved) IO.println("Paris is not removed from the list");
        else IO.println("Paris is removed from the list.");
        IO.println("cityList = " + cityList);
        IO.println();

        //-------------------------------------------------

        IO.println("Tests on list with MORE cities:");
        IO.println();

        cityList.add(paris);
        cityList.add(london);
        cityList.add(amsterdam);
        cityList.add(rom);

        IO.println("cityList = " + cityList);
        IO.println();

        city = cityList.removeFirst();
        if (city == null) IO.println("Nothing removed from the list");
        else IO.println("Removed: " + city);
        IO.println("cityList = " + cityList);
        IO.println();

        inList = cityList.contains(london);
        if (!inList) IO.println("London is NOT in the list");
        else IO.println("London is in the list");
        IO.println("cityList = " + cityList);
        IO.println();

        isRemoved = cityList.remove(paris);
        if (!isRemoved) IO.println("Paris is not removed from the list");
        else IO.println("Paris is removed from the list.");
        IO.println("cityList = " + cityList);
        IO.println();
    }
}
