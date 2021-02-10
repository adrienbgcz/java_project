package project1;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.*;



public class MyClass {


    public static void main(String[] args) {


        Client client = new Client();


        try (Scanner scanner = new Scanner(System.in)) {




            // J'aimerais renseigner un nombre au bon format. Regex ? (string obligatoire ? si oui quid des calculs )
            // SANTE
            System.out.println("Renseignez votre prénom : ");
            String clientFirstName = scanner.nextLine();
            client.healthProfile.setFirstName(clientFirstName);

            System.out.println("Renseignez votre nom : ");
            String clientLastName = scanner.nextLine();
            client.healthProfile.setLastName(clientLastName);

            System.out.println("Etes-vous un homme ou une femme ?");
            System.out.println("Tapez M si vous êtes un homme");
            System.out.println("Tapez F si vous êtes une femme");
            String clientGender = scanner.nextLine();
            client.healthProfile.setGender(clientGender);
            while (!client.healthProfile.getGender().equals("M") && !client.healthProfile.getGender().equals("F")) {
                System.out.println("Tapez M ou F :");
                clientGender = scanner.nextLine();
                client.healthProfile.setGender(clientGender);
            }

            System.out.println("Renseignez votre âge : ");
            do {
                try {
                    int clientAge = scanner.nextInt();
                    //clientAge.toString() //donne l'age en en string pour vérif expression régulière
                    client.healthProfile.setAge(clientAge);
                } catch (InputMismatchException e) {
                    scanner.next();
                    System.out.println("Vous devez renseigner un nombre entier :");
                }
            } while (client.healthProfile.getAge() == 0);


            System.out.println("Renseignez votre taille en mètres (ex: 1,78) : ");
            do {
                try {
                    Double clientHeight = scanner.nextDouble(); //Double en classe
                 //   Pattern pattern = Pattern.compile("[0-9][.,][0-9]{2}");
                 //   Matcher matcher = pattern.matcher(clientHeight.toString());       // je n'arrive pas à entrer dans cette boucle
                 //   boolean b = matcher.matches();
                 //   if (b) {
                      client.healthProfile.setHeight(clientHeight);
                 //   System.out.println(client.healthProfile.getHeight());
                 //   } else {
                 //       System.out.println("Vous devezzz renseigner un nombre au format 0,00 :");
                 //   }

                } catch (InputMismatchException e) {
                    scanner.next();
                    System.out.println("Vous devez renseigner un nombre au format 0,00 :");
                }
            } while (client.healthProfile.getHeight() == null);

            System.out.println(client.healthProfile.getHeight());




            System.out.println("Renseignez votre poids en kg : ");
            do {
                try {
                    double clientWeight = scanner.nextDouble();
                    client.healthProfile.setWeight(clientWeight);
                } catch (InputMismatchException e) {
                    scanner.next();
                    System.out.println("Vous devez renseigner un nombre :");
                }
            } while (client.healthProfile.getWeight() == 0);
// J'aimerais renseigner un nombre entre X et Y . Regex ? (string obligatoire ? si oui quid des calculs


            System.out.println("Si vous connaissez votre tour de taille, tapez 1. Sinon, tapez 2.");

            int choiceWaist = 0;

            do {
                try {
                    choiceWaist = scanner.nextInt();
                    if (choiceWaist != 1 && choiceWaist != 2)
                    {
                        throw new Exception ("Tapezzzz 1 ou 2");
                    }

                } catch (InputMismatchException e) {
                    scanner.next();
                    System.out.println("Tapez 1 ou 2 :");
                    choiceWaist = 0;
                } catch (Exception e) {
                    e.printStackTrace(); //si le pas 1 ou 2
                    System.out.println("Tapez 1 ou 2 :");
                    choiceWaist = 0;// pour être sur de ne pas sortir de la boucle et revenir au try
                }
            } while (choiceWaist != 1 && choiceWaist != 2);

            System.out.println(choiceWaist);

            if (choiceWaist == 1) {
                System.out.println("Renseignez votre tour de taille en centimètres (mesurez au creux de la taille, à l'endroit le plus fin).");
                int clientWaist = scanner.nextInt();
                client.healthProfile.setWaist(clientWaist);

            }


///////////////////////////////////////////////////////////////////////////////////////////////



                System.out.println("Si vous connaissez votre tour de bassin, tapez 1. Sinon, tapez 2.");
                int choiceHips = 0;

                do {
                    try {
                        choiceHips = scanner.nextInt();
                        if (choiceHips != 1 && choiceHips != 2) {
                            throw new Exception ("Tapezzzz 1 ou 2");
                        }
                    }
                    catch (InputMismatchException e) {
                            scanner.next();
                            System.out.println("Tapez 1 ou 2 :");
                            choiceHips = 0;
                    }

                    catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Tapez 1 ou 2 :");
                        choiceHips = 0;
                    }
                } while (choiceHips != 1 && choiceHips != 2);

                if (choiceHips == 1) {
                    System.out.println("Renseignez votre tour de bassin en cm (mesurez au niveau des fesses, à l'endroit le plus large)");
                    int clientHips = scanner.nextInt();
                    client.healthProfile.setHips(clientHips);
                }



// AP
                System.out.println("Si vous souhaitez calculer votre dépense énergétique quotidienne totale, tapez 1. Sinon, tapez 2.");
                System.out.println("Attention, la procédure prend quelques minutes.");

                int choiceTotalEnergyExpenditure = 0;
            do {
                try {
                    choiceTotalEnergyExpenditure = scanner.nextInt();
                    if (choiceTotalEnergyExpenditure != 1 && choiceTotalEnergyExpenditure != 2)
                    {
                        throw new Exception ("Tapezzzz 1 ou 2");
                    }

                } catch (InputMismatchException e) {
                    scanner.next();
                    System.out.println("Tapez 1 ou 2 :");
                    choiceTotalEnergyExpenditure = 0;
                } catch (Exception e) {
                    e.printStackTrace(); //si le pas 1 ou 2
                    System.out.println("Tapez 1 ou 2 :");
                    choiceWaist = 0;// pour être sur de ne pas sortir de la boucle et revenir au try
                }
            } while (choiceWaist != 1 && choiceWaist != 2); // si je tape un nombre autre que 1 ou 2 je ne sors pas de la boucle


                if (choiceTotalEnergyExpenditure == 1) {
                    System.out.println("Indiquez, en nombre d'heures par jour, le temps passé dans les 6 situations suivantes. Elles vont de la moins intense à la plus intense. Le total doit être égal à 24 heures." + "/n");

                    System.out.println("1 - Indiquez votre temps passé allongé (Dormir, faire la sieste, se reposer) :");
                    double clientActivityLevel1 = scanner.nextInt() * 1;
                    client.activityProfile.setLevel1(clientActivityLevel1);

                    System.out.println("2 - Indiquez votre temps passé assis (Repos, télévision, ordinateur, jeux vidéo, lecture, écriture, transports, repas) :");
                    double clientActivityLevel2 = scanner.nextInt() * 1.5;
                    client.activityProfile.setLevel2(clientActivityLevel2);

                    System.out.println("3 - Indiquez votre temps passé debout sans marcher ou très peu (toilette, cuisine, petits déplacements dans le domicile ou le bureau) :");
                    double clientActivityLevel3 = scanner.nextInt() * 2.2;
                    client.activityProfile.setLevel3(clientActivityLevel3);

                    System.out.println("4 - Indiquez votre temps passé à être moyennement actif (marche à allure modérée, yoga, gym douce, ménage, activité professionnelles manuelles moyennes) :");
                    double clientActivityLevel4 = scanner.nextInt() * 3;
                    client.activityProfile.setLevel4(clientActivityLevel4);

                    System.out.println("5 - Indiquez votre temps passé à être actif (Marche rapide, jardinage, bricolage, activités professionnelles manuelles vigoureuses) :");
                    double clientActivityLevel5 = scanner.nextInt() * 3.5;
                    client.activityProfile.setLevel5(clientActivityLevel5);

                    System.out.println("6 - Indiquez votre temps passé à être très actif (Sports, activités professionnelles intenses, gros travaux, compétitions)");
                    double clientActivityLevel6 = scanner.nextInt() * 5;
                    client.activityProfile.setLevel6(clientActivityLevel6);
                } else if (choiceTotalEnergyExpenditure == 2) {

                }


//CREATION VARIABLES CALCULEES

                double clientImc = CalculUtils.calculImc(client.healthProfile.getWeight(), client.healthProfile.getHeight());
                client.healthProfile.setImc(clientImc);


                if (client.healthProfile.getWaist() != 0 && client.healthProfile.getHips() != 0) {
                    double clientWaistHipsRatio = CalculUtils.calculWaistHipsRatio(client.healthProfile.getWaist(), client.healthProfile.getHips());
                    client.healthProfile.setWaistHipsRatio(clientWaistHipsRatio);

                } else if (client.healthProfile.getWaist() == 0 || client.healthProfile.getHips() == 0) {

                }


                if (client.healthProfile.getGender().equals("M")) {
                    int clientMetabolism = CalculUtils.calculMaleMetabolism(client.healthProfile.getWeight(), client.healthProfile.getHeight(), client.healthProfile.getAge());
                    client.healthProfile.setMetabolism(clientMetabolism);
                } else if (client.healthProfile.getGender().equals("F")) {
                    int clientMetabolism = CalculUtils.calculFemaleMetabolism(client.healthProfile.getWeight(), client.healthProfile.getHeight(), client.healthProfile.getAge());
                    client.healthProfile.setMetabolism(clientMetabolism);
                }

                double clientTotalActivityLevel = CalculUtils.calculTotalActivityLevel(client.activityProfile.getLevel1(), client.activityProfile.getLevel2(), client.activityProfile.getLevel3(), client.activityProfile.getLevel4(), client.activityProfile.getLevel5(), client.activityProfile.getLevel6());
                client.activityProfile.setTotalActivityLevel(clientTotalActivityLevel);
                System.out.println(client.activityProfile.getTotalActivityLevel());


                int clientTotalEnergyExpenditure = CalculUtils.calculTotalEnergyExpenditure(client.healthProfile.getMetabolism(), client.activityProfile.getTotalActivityLevel());
                client.activityProfile.setTotalEnergyExpenditure(clientTotalEnergyExpenditure);
                System.out.println(client.activityProfile.getTotalEnergyExpenditure());

//AFFICHAGE RESULTATS

                DecimalFormat dfImc = new DecimalFormat("##.#");
                System.out.println("Vous avez un IMC de : " + dfImc.format(client.healthProfile.getImc()) + ". Cela signifie que ");


//Interpretation IMC
                if (client.healthProfile.getImc() > 18.5 && client.healthProfile.getImc() < 25) {
                    System.out.println("vous avez un poids normal par rapport à votre taille." + "\n");

                }

                if (client.healthProfile.getImc() >= 25 && client.healthProfile.getImc() < 30) {
                    System.out.println("vous êtes en surpoids." + "\n");
                }

                if (client.healthProfile.getImc() < 18.5) {
                    System.out.println("vous avez un poids insuffisant par rapport à votre taille." + "\n");
                }

                if (client.healthProfile.getImc() >= 30 && client.healthProfile.getImc() < 35) {
                    System.out.println("vous êtes en situation d'obésité modérée." + "\n");
                }

                if (client.healthProfile.getImc() >= 35) {
                    System.out.println("vous êtes en situation d'obésité sévère." + "\n");
                }


            }


            //Conditions affichage tour de taille et bassin

            if (client.healthProfile.getWaist() != 0 && client.healthProfile.getHips() == 0) {
                System.out.println("Vous avez un tour de taille de " + client.healthProfile.getWaist() + " cm et vous n'avez pas renseigné votre tour de bassin." + "\n");
            } else if (client.healthProfile.getWaist() == 0 && client.healthProfile.getHips() != 0) {
                System.out.println("Vous avez un tour de bassin de " + client.healthProfile.getHips() + " cm et vous n'avez pas renseigné votre tour de taille." + "\n");
            } else if (client.healthProfile.getWaist() == 0 && client.healthProfile.getHips() == 0) {
                System.out.println("Vous n'avez pas renseigné vos tours de taille et de bassin." + "\n");
            } else if (client.healthProfile.getWaist() != 0 && client.healthProfile.getHips() != 0) {
                System.out.println("Vous avez un tour de taille de " + client.healthProfile.getWaist() + " cm et un tour de bassin de " + client.healthProfile.getHips() + " cm." + "\n");
            }


            if (client.healthProfile.getWaistHipsRatio() != 0) {
                DecimalFormat dfWhr = new DecimalFormat("#.##");
                System.out.println("Vous avez un ratio taille/hanches de : " + dfWhr.format(client.healthProfile.getWaistHipsRatio()) + ". Cela signifie que ");
            }


            //Interpretation RTH

            if (client.healthProfile.getWaistHipsRatio() <= 0.80 && client.healthProfile.getGender().equals("F") && client.healthProfile.getWaist() != 0 && client.healthProfile.getHips() != 0) {
                System.out.println("votre ratio taille/hanches représente un point positif pour votre santé : une répartition des graisses sur le bas du corps est moins nocive qu'au niveau de l'abdomen." + "\n");
            }

            if (client.healthProfile.getWaistHipsRatio() >= 0.81 && client.healthProfile.getWaistHipsRatio() < 0.85 && client.healthProfile.getGender().equals("F") && client.healthProfile.getWaist() != 0 && client.healthProfile.getHips() != 0) {
                System.out.println("votre ratio taille/hanches représente un risque modéré pour votre santé : une répartition des graisses sur le bas du corps est moins nocive qu'au niveau de l'abdomen." + "\n");
            }

            if (client.healthProfile.getWaistHipsRatio() >= 0.85 && client.healthProfile.getGender().equals("F") && client.healthProfile.getWaist() != 0 && client.healthProfile.getHips() != 0) {
                System.out.println("votre ratio taille/hanches représente un risque élevé pour votre santé : une répartition des graisses sur le bas du corps est moins nocive qu'au niveau de l'abdomen." + "\n");
            }

            if (client.healthProfile.getWaistHipsRatio() <= 0.95 && client.healthProfile.getGender().equals("M") && client.healthProfile.getWaist() != 0 && client.healthProfile.getHips() != 0) {
                System.out.println("votre ratio taille/hanches représente un point positif pour votre santé : une répartition des graisses sur le bas du corps est moins nocive qu'au niveau de l'abdomen." + "\n");
            }

            if (client.healthProfile.getWaistHipsRatio() >= 0.96 && client.healthProfile.getWaistHipsRatio() < 1.0 && client.healthProfile.getGender().equals("M") && client.healthProfile.getWaist() != 0 && client.healthProfile.getHips() != 0) {
                System.out.println("votre ratio taille/hanches représente un risque modéré pour votre santé : une répartition des graisses sur le bas du corps est moins nocive qu'au niveau de l'abdomen." + "\n");
            }

            if (client.healthProfile.getWaistHipsRatio() >= 1.0 && client.healthProfile.getGender().equals("M") && client.healthProfile.getWaist() != 0 && client.healthProfile.getHips() != 0) {
                System.out.println("votre ratio taille/hanches représente un risque élevé pour votre santé : une répartition des graisses sur le bas du corps est moins nocive qu'au niveau de l'abdomen." + "\n");
            }


            // Interpretation tour de taille

            if (client.healthProfile.getGender().equals("M") && client.healthProfile.getWaist() < 102 && client.healthProfile.getWaist() != 0) {
                System.out.println("Votre tour de taille est normal." + "\n");
            } else if (client.healthProfile.getGender().equals("M") && client.healthProfile.getWaist() >= 102) {
                System.out.println("Votre tour de taille est trop élevé. Il ne devrait pas dépasser 101 cm. L'accumulation de graisse abdominale augmente les risques cardiovasculaires." + "\n");
            } else if (client.healthProfile.getGender().equals("F") && client.healthProfile.getWaist() >= 88) {
                System.out.println("Votre tour de taille est trop élevé. Il ne devrait pas dépasser 87 cm. L'accumulation de graisse abdominale augmente les risques cardiovasculaires." + "\n");
            } else if (client.healthProfile.getGender().equals("F") && client.healthProfile.getWaist() < 88 && client.healthProfile.getWaist() != 0) {
                System.out.println("Votre tour de taille est normal." + "\n");
            }

            // Affichage métabolisme de base

            System.out.println("Votre métabolisme de base (énergie que vous dépensez pour faire fonctionner votre corps au repos) est de " + client.healthProfile.getMetabolism() + " calories par jour.");


            // Affichage DEJ


            if (client.activityProfile.getTotalEnergyExpenditure() != 0) {
                System.out.println("Votre dépense énergétique totale quotidienne est de " + client.activityProfile.getTotalEnergyExpenditure() + " calories par jour.");
            } else {

            }

            //Conditions affichage AP
        }
    }

