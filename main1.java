class main1{
    public static void main(String[] args) {
        boolean ticket_Present=true;
         int age=20;
        if(ticket_Present == true){
            if(age>=18){
                System.err.println("Watch movie");
            }
            else{
                System.err.println("Too young");
            }
           
        }
        else{
            System.out.println("Buy ticket");
        }
    }
}