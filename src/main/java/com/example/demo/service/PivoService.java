package com.example.demo.service;

import com.example.demo.controller.UserView;
import org.springframework.stereotype.Service;

@Service
public class PivoService {

    public PivoService(){}

    //it must be in database, not in arrays
    private String[] popularNames = {"Djorje", "Dushan", "Ivana", "Nina", "Ana", "Sergey", "Milosh", "Vika", "Diana", "Leon"}; //0-9
    private int[] ages = {19, 23, 28, 22, 18, 25, 99, 24, 24, 20};
    private String[] links = {
            "https://upload.wikimedia.org/wikipedia/en/d/d4/Mickey_Mouse.png",
            "https://upload.wikimedia.org/wikipedia/en/thumb/c/ce/Mrs._Puff.svg/1024px-Mrs._Puff.svg.png",
            "https://upload.wikimedia.org/wikipedia/en/thumb/3/3b/SpongeBob_SquarePants_character.svg/1024px-SpongeBob_SquarePants_character.svg.png",
            "https://upload.wikimedia.org/wikipedia/en/a/a6/Pokémon_Pikachu_art.png",
            "https://upload.wikimedia.org/wikipedia/en/thumb/a/a0/Sandy_Cheeks.svg/1024px-Sandy_Cheeks.svg.png",
            "https://upload.wikimedia.org/wikipedia/en/6/62/Kermit_the_Frog.jpg",
            "https://upload.wikimedia.org/wikipedia/en/thumb/8/8f/Squidward_Tentacles.svg/1024px-Squidward_Tentacles.svg.png",
            "https://upload.wikimedia.org/wikipedia/en/thumb/3/33/Patrick_Star.svg/1024px-Patrick_Star.svg.png",
            "https://upload.wikimedia.org/wikipedia/en/thumb/5/5d/Pearl_the_Whale.svg/800px-Pearl_the_Whale.svg.png",
            "https://upload.wikimedia.org/wikipedia/en/thumb/f/f8/Mr._Krabs.svg/1024px-Mr._Krabs.svg.png",
            "https://upload.wikimedia.org/wikipedia/en/thumb/5/5d/Pearl_the_Whale.svg/800px-Pearl_the_Whale.svg.png"
    };

   public String getRandomName(){
       int randomIndex = (int) (Math.random() * popularNames.length);
       return popularNames[randomIndex];
   }

    public UserView getUser(String userId) {
        int id = 0;
        try {
            int intUserId = Integer.parseInt(userId);
            if (intUserId >= 0 && intUserId < popularNames.length) {
                id = intUserId;
            }
        } catch (NumberFormatException ignore) {
            System.out.println("userId was incorrect! " + userId);
        }

        return new UserView(popularNames[id], ages[id], links[id]);
    }
}
