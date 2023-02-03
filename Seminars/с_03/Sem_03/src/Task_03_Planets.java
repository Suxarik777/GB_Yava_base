

import java.util.ArrayList;
import java.util.List;

public class Task_03_Planets {

    public static void FillPlanetsList() {
        String[] AllPlanets = new String[]{"Меркурий", "Венера", "Земля", "Нептун", "Плутон", "Юпитер"};
        List<String> planetList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            planetList.add(AllPlanets[(int) Math.random() * AllPlanets.length]);
        }
        for (String string : planetList) {
            System.out.print(string + " ");
        }

        planetList.sort(null);
        for (String string : planetList) {
            System.out.print(string + " ");
        }

        System.out.println();
        int count = 1;
        int lengthList = planetList.size();
        for (int i = 0; i < planetList.size(); i++) {
            if (planetList.get(i) != planetList.get(i-1)){
                System.out.println(planetList.get(i-1) + " " + count);
                count = 1;
            }
            else count++;
        }
        System.out.println(planetList.get(planetList.size()-1) + " " + count);
    }

    public static void main(String[] args) {
        FillPlanetsList();
    }

}
