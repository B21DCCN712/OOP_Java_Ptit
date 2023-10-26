package Bai8;

public class Lop_User {
    private String tk,mk;
        private int x = 0;
        public Lop_User(String tk,String mk){
            this.tk = tk;
            this.mk = mk;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public boolean check (String a, String b ){
            if ( a.equals(tk) && b.equals(mk) ) return true;
            return false;
        }

        @Override
        public String toString(){
            return "" + x;
        }
}
