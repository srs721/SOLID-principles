class Bills {
    public float bill(){
        Grocery g = new Grocery();
        float amount = 0;
        for(float item: g.getMap().values()){
            amount += item;
        }
        return amount;
    }
}