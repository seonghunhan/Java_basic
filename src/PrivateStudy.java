public class PrivateStudy {

        private String name;
        private int score;

        public PrivateStudy(String n, int s){
            this.name = n;
            this.score = s;
        }

        public void getInfo(){
            System.out.println("----getInfo---");
            System.out.println("name : " + name);
            System.out.println("score : " + score);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
}
