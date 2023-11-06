package com.campusdual.exercisespoo.exerciseHerencias;

public class Ave extends Animal {
        protected String habitat;
        protected boolean vuela;

        public Ave(int altura, int peso, int edad, String habitat, boolean vuela) {
            super(altura, peso, edad);
            this.habitat = habitat;
            this.vuela = vuela;
        }

        public String getHabitat() {
            return habitat;
        }

        public void setHabitat(String habitat) {
            this.habitat = habitat;
        }

        public boolean isVuela() {
            return vuela;
        }

        public void setVuela(boolean vuela) {
            this.vuela = vuela;
        }

}
