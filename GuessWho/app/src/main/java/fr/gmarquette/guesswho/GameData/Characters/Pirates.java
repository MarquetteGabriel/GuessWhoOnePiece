/*
 *
 * @brief Copyright (c) 2023 Gabriel Marquette
 *
 * Copyright (c) 2023 Gabriel Marquette. All rights reserved.
 *
 */

package fr.gmarquette.guesswho.GameData.Characters;

import java.util.ArrayList;
import java.util.List;

import fr.gmarquette.guesswho.GameData.Database.Characters;

class Pirates {


    private static final List<Characters> listCharacters = new ArrayList<>();

    static List<Characters> getPirates() {
        MugiwaraCrew();
        ShanksCrew();
        TeachCrew();
        CrossGuild();
        NewgateCrew();
        BigMomCrew();
        KaidoCrew();

        EnerCrew();


        return listCharacters;
    }

    private static void MugiwaraCrew()
    {
        Characters luffy = new Characters("Monkey D. Luffy", true, "3000000000", 1, "Pirate", true, 19, "Mugiwara's Crew", 0);
        Characters zoro = new Characters("Roronoa Zoro", false, "1111000000", 3, "Pirate", true, 21, "Mugiwara's Crew", 0);
        Characters nami = new Characters("Nami", false, "366000000", 8, "Pirate", true, 20, "Mugiwara's Crew", 0);
        Characters usopp = new Characters("Usopp", false, "500000000", 23, "Pirate", true, 19, "Mugiwara's Crew", 0);
        Characters sanji = new Characters("Vinsmoke Sanji", false, "1032000000", 43, "Pirate", true, 21, "Mugiwara's Crew", 0);
        Characters chopper = new Characters("Tony-Tony Chopper", true, "1000", 134, "Pirate", true, 17, "Mugiwara's Crew", 0);
        Characters robin = new Characters("Nico Robin", true, "930000000", 114, "Pirate", true, 30, "Mugiwara's Crew", 0);
        Characters franky = new Characters("Franky / Cutty Flam", false, "394000000", 329, "Pirate", true, 36, "Mugiwara's Crew", 0);
        Characters brook = new Characters("Brook", true, "383000000", 442, "Pirate", true, 90, "Mugiwara's Crew", 0);
        Characters jinbei = new Characters("Jinbei", false, "1100000000", 528, "Pirate", true, 46, "Mugiwara's Crew", 0);

        listCharacters.add(luffy);
        listCharacters.add(zoro);
        listCharacters.add(nami);
        listCharacters.add(usopp);
        listCharacters.add(sanji);
        listCharacters.add(chopper);
        listCharacters.add(robin);
        listCharacters.add(franky);
        listCharacters.add(brook);
        listCharacters.add(jinbei);
    }

    private static void ShanksCrew()
    {
        Characters shanks = new Characters("Shanks", false, "4048900000", 1, "Pirate", true, 39, "Shanks's Crew", 0);
        Characters beckman = new Characters("Ben Beckmann", false, "Unknown", 1, "Pirate", true, 50, "Shanks's Crew", 0);
        Characters roo = new Characters("Lucky Roo", false, "Unknown", 1, "Pirate", true, 35, "Shanks's Crew", 1);
        Characters yasopp = new Characters("Yasopp", false, "Unknown", 1, "Pirate", true, 47, "Shanks's Crew", 1);
        //Characters limejuice = new Characters("Limejuice", false, "Unknown", 41, "Pirate", true, ??, "Shanks's Crew", 1);
        //Characters bonk = new Characters("Bonk Punch", false, "Unknown", 1, "Pirate", true, ??, "Shanks's Crew", 1);
        //Characters monster = new Characters("Monster", false, "Unknown", 1, "Pirate", true, ??, "Shanks's Crew", 1);
        //Characters snake = new Characters("Building Snake", false, "Unknown", 41, "Pirate", true, ??, "Shanks's Crew", 1);
        //Characters hongo = new Characters("Hongo", false, "Unknown", 1, "Pirate", true, 90, "Shanks's Crew", 1);
        //Characters howling = new Characters("Howling Dab", false, "Unknown", 580, "Pirate", true, ??, "Shanks's Crew", 1);
        //Characters rockstar = new Characters("Rockstar", false, "94000000", 234, "Pirate", true, ??, "Shanks's Crew", 1);
        Characters uta = new Characters("Uta", true, "Unknown", 1055, "Pirate", true, 21, "Shanks's Crew", 1);


        listCharacters.add(shanks);
        listCharacters.add(beckman);
        listCharacters.add(roo);
        listCharacters.add(yasopp);
        //listCharacters.add(limejuice);
        //listCharacters.add(bonk);
        //listCharacters.add(monster);
        //listCharacters.add(snake);
        //listCharacters.add(hongo);
        //listCharacters.add(howling);
        //listCharacters.add(rockstar);
        listCharacters.add(uta);
    }

    private static void TeachCrew()
    {
        Characters teach = new Characters("Marshall D. Teach", true, "3996000000", 223, "Pirate", true, 40, "Teach's Crew", 0);
        Characters burgess = new Characters("Jesus Burgess", true, "20000000", 222, "Pirate", true, 29, "Teach's Crew", 0);
        Characters shiliew = new Characters("Shiliew", true, "Unknown", 538, "Pirate", true, 44, "Teach's Crew", 0);
        Characters auger = new Characters("Van Auger", true, "64000000", 222, "Pirate", true, 27, "Teach's Crew", 0);
        Characters pizarro = new Characters("Avalo Pizarro", true, "Unknown", 575, "Pirate", true, 42, "Teach's Crew", 0);
        Characters laffitte = new Characters("Laffitte", true, "42200000", 234, "Pirate", true, 41, "Teach's Crew", 0);
        Characters devon = new Characters("Catarina Devon", true, "Unknown", 575, "Pirate", true, 36, "Teach's Crew", 0);
        Characters wolf = new Characters("Sanjuan Wolf", true, "Unknown", 575, "Pirate", true, 99, "Teach's Crew", 0);
        Characters vasco = new Characters("Vasco Shot", true, "Unknown", 575, "Pirate", true, 38, "Teach's Crew", 0);
        Characters doq = new Characters("Doc Q", true, "72000000", 223, "Pirate", true, 28, "Teach's Crew", 0);
        Characters kuzan = new Characters("Kuzan / Aokiji", true, "Unknown", 303, "Pirate", true, 49, "Teach's Crew", 0);
        //Characters pinkBeard = new Characters("Barbe Rose", true, "52000000", 904, "Pirate", true, ??, "Teach's Crew", 1);

        listCharacters.add(teach);
        listCharacters.add(burgess);
        listCharacters.add(shiliew);
        listCharacters.add(auger);
        listCharacters.add(pizarro);
        listCharacters.add(laffitte);
        listCharacters.add(devon);
        listCharacters.add(wolf);
        listCharacters.add(vasco);
        listCharacters.add(doq);
        listCharacters.add(kuzan);
    }

    private static void CrossGuild()
    {
        Characters baggy = new Characters("Baggy", true, "3189000000", 9, "Pirate", true, 39, "Cross Guild", 0);
        Characters mihawk = new Characters("Dracule Mihawk", false, " 3590000000", 49, "Pirate", true, 43, "Cross Guild", 0);
        Characters crocodile = new Characters("Crocodile", true, "1965000000", 126, "Pirate", true, 46, "Cross Guild", 0);
        Characters das = new Characters("Das Bones / Mr 1", true, "75000000", 160, "Pirate", true, 31, "Cross Guild", 0);
        Characters alvida = new Characters("Alvida", true, "5000000", 2, "Pirate", true, 27, "Cross Guild", 0);
        Characters galdino = new Characters("Galdino / Mr 3", true, "24000000", 117, "Pirate", true, 37, "Cross Guild", 1);
        Characters morge = new Characters("Morge", false, "Unknown", 9, "Pirate", true, 29, "Cross Guild", 1);
        Characters cabadji = new Characters("Cabadji", false, "Unknown", 9, "Pirate", true, 34, "Cross Guild", 1);

        listCharacters.add(baggy);
        listCharacters.add(mihawk);
        listCharacters.add(crocodile);
        listCharacters.add(das);
        listCharacters.add(alvida);
        listCharacters.add(galdino);
        listCharacters.add(morge);
        listCharacters.add(cabadji);
    }

    private static void NewgateCrew()
    {
        Characters ace = new Characters("Portgas D. Ace", true, "550000000", 154, "Pirate", false, 20, "Newgate's Crew", 0);

        listCharacters.add(ace);
    }

    private static void BigMomCrew()
    {
        Characters katakuri = new Characters("Charlotte Katakuri", true, "1057000000", 860, "Pirate", true, 48, "BigMom's Crew", 0);

        listCharacters.add(katakuri);
    }

    private static void KaidoCrew()
    {

    }

    private static void EnerCrew()
    {
        Characters ener = new Characters("Ener", true, "Unknown", 254, "Pirate", true, 39, "Ener's Crew", 0);

        listCharacters.add(ener);
    }
}
