import java.util.Scanner;

public class burc {

    public static void main(String[] args) {

        try (Scanner inp = new Scanner(System.in)) {
            byte ay, gun;

            Boolean isError = false;
            String burc = "";

            System.out.println("Ay giriniz :");
            ay = inp.nextByte();

            System.out.println("Gün giriniz :");
            gun = inp.nextByte();

            if ((ay >= 1 && ay <= 12) && (gun >= 1 && gun <= 31)) {
                if (ay == 1 && gun < 22) {
                    burc = "Oğlak";
                } else if (ay == 1 && gun >= 22) {
                    burc = "Kova";
                }
                if (ay == 2 && gun <= 28) {
                    if (ay == 2 && gun < 20) {
                        burc = "Kova";
                    } else if (ay == 2 && gun >= 20) {
                        burc = "Balık";
                    }
                } else if (ay == 2 && gun >= 28) {
                    isError = true;
                }
                if (ay == 3 && gun <= 31) {
                    if (ay == 3 && gun <= 20) {
                        burc = "Balık";
                    } else if (ay == 3 && gun > 20) {
                        burc = "Koç";
                    }
                } else if (ay == 3 && gun >= 31) {
                    isError = true;
                }
                if (ay == 4 && gun <= 30) {
                    if (ay == 4 && gun <= 20) {
                        burc = "Koç";
                    } else if (ay == 4 && gun > 20) {
                        burc = "Boğa";
                    }
                } else if (ay == 4 && gun >= 30) {
                    isError = true;
                }

                if (ay == 5 && gun <= 31) {
                    if (ay == 5 && gun <= 21) {
                        burc = "Boğa";
                    } else if (ay == 5 && gun > 21) {
                        burc = "İkizler";
                    }
                } else if (ay == 5 && gun >= 31) {
                    isError = true;
                }

                if (ay == 6 && gun <= 30) {
                    if (ay == 6 && gun <= 22) {
                        burc = "İkizler";
                    } else if (ay == 6 && gun > 22) {
                        burc = "Yengeç";
                    }
                } else if (ay == 6 && gun >= 30) {
                    isError = true;
                }

                if (ay == 7 && gun <= 31) {
                    if (ay == 7 && gun <= 22) {
                        burc = "Yengeç";
                    } else if (ay == 7 && gun > 22) {
                        burc = "Aslan ";
                    }
                } else if (ay == 7 && gun >= 31) {
                    isError = true;
                }

                if (ay == 8 && gun <= 31) {
                    if (ay == 8 && gun <= 22) {
                        burc = "Aslan";
                    } else if (ay == 8 && gun > 22) {
                        burc = "Başak ";
                    }
                } else if (ay == 8 && gun >= 31) {
                    isError = true;
                }

                if (ay == 9 && gun <= 30) {
                    if (ay == 9 && gun <= 22) {
                        burc = "Başak";
                    } else if (ay == 9 && gun > 22) {
                        burc = "Terazi";
                    }
                } else if (ay == 9 && gun >= 30) {
                    isError = true;
                }

                if (ay == 10 && gun <= 31) {
                    if (ay == 10 && gun <= 22) {
                        burc = "Terazi";
                    } else if (ay == 10 && gun > 22) {
                        burc = "Akrep";
                    }
                } else  if (ay == 10 && gun >= 31) {
                    isError = true;
                }

                if (ay == 11 && gun <= 30) {
                    if (ay == 11 && gun <= 21) {
                        burc = "Akrep";
                    } else if (ay == 11 && gun > 21) {
                        burc = "Yay";
                    }
                } else if (ay == 11 && gun >= 30) {
                    isError = true;
                }

                if (ay == 12 && gun <= 31) {
                    if (ay == 12 && gun <= 21) {
                        burc = "Yay";
                    } else if (ay == 12 && gun > 21) {
                        burc = "Oğlak";
                    }
                } else if (ay == 12 && gun >= 31) {
                    isError = true;
                }

            } else {
                System.out.println("Hata gün 1-31 arasında olmalı.");
                return;

            }
            if (isError) {
                System.out.println("Hatalı giriş yaptınız.");

            } else {
                System.out.println("Burcunuz :" + burc);
            }
        }

    }
}