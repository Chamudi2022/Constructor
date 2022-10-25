 class Constructor2{
    String lan;
Constructor2(String val){
         lan = "val";
         System.out.println("lan");


}

    public static void main(String[] args) {
        Constructor2 a = new Constructor2("Java");
        Constructor2 b = new Constructor2("Python");
        Constructor2 c = new Constructor2("C");
        Constructor2 d = new Constructor2("Kotlin");
    }
}