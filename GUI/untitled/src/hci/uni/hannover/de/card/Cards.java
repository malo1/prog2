package hci.uni.hannover.de.card;


public enum Cards {
    KREUZASS(11), PIKASS (11),HERZASS(11),KAROASS(11),
    KREUZKOENIG(10),PIKKOENIG(10),HERZKOENIG(10),KAROKOENIG(10),
    KREUZDAME(10),PIKDAME(10),HERZDAME(10),KARODAME(10),
    KREUZBUBE(10),PIKBUBE(10),HERZBUBE(10),KAROBUBE(10),
    KREUZZEHN(10),PIKZEHN(10),HERZZEHN(10),KAROZEHN(10),
    KREUZNEUN(9),PIKNEUN(9),HERZNEUN(9),KARONEUN(9),
    KREUZACHT(8),PIKACHT(8),HERZACHT(8),KAROACHT(8),
    KREUZSIEBEN(7),PIKSIEBEN(7),HERZSIEBEN(7),KAROSIEBEN(7);

    private int value;
    public int position;
    Cards(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
    public int getPosition(){}
    public void setPosition(){}

}
