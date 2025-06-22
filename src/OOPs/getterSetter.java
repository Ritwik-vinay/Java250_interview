package OOPs;

public class getterSetter {
    public static void main(String[] args) {
        getAnimalDetails animalDetails = new getAnimalDetails();
        animalDetails.setBreed("Labrador");
        animalDetails.setColor("Cream");
        System.out.println(animalDetails.getBreed());
        System.out.println(animalDetails.getColor());

    }
    static class getAnimalDetails{
        String color;
        String breed;
        private void  show(){
            String color;
            String breed;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }


    }
}
