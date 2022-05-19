public class CubsSum {

    /**
     * The parameter of the function findNb (find_nb, find-nb, findNb, ...)
     * will be an INTEGER m and you have to return the integer n such as n^3 + (n-1)^3 + ... + 1^3 = m
     * if such a n exists or -1 if there is no such n.
     *
     * ��� ���������� ��������� ������ ������� � ����������, �� ��� �������� � ��� ���� �������� ����
     *
     * @param args
     */
    public static void main(String[] args) {
        int count = 0;
        int m = 1071225;
        count =  findNb(m);
        System.out.println("count= " + count);
    }

    /**
     * ������� ������ ���������
     * ����� ����� ���������� ����� (N^2*(N+1)^2)/4
     * ��� ��������� m �� �������� N^2+N-2*Math.sqrt(m,2)= 0
     * ������ ����� ������������
     * ���� ������� 2 ����� ��������� ������ ��� ��� �������� ����������
     * �� ���������� ������ ������ , ��� � ��� �������� ������������������
     * ������ ������ ��������� ���� ������ �����������
     * @param m ����� ����������
     * @return ���������� ������ ����� ������� ����  ��� -1 :
     */
    public static int findNb(int m) {
        // your code

        int D= (int) (-1l + 8l*(Math.sqrt(m)));
        int n1=0;
        int n2=0;
        int tmp1=0;
        int tmp2=0;
        if(D>0){
            n1= (int) ((-1l + Math.sqrt(D))/2);
            n2= (int) ((-1l - Math.sqrt(D))/2);
            n1=Math.abs(n1);
            n2=Math.abs(n2);
            System.out.println("����� ���������: n1 = " + n1 + ", n2 = " +n2) ;
            tmp1= (int) ((Math.pow(n1,2)*Math.pow((n1+1),2))/4l);
            tmp2= (int) ((Math.pow(n2,2)*Math.pow((n2+1),2))/4l);
            System.out.println("����� ���������: tmp1 = " + tmp1 + ", tmp2 = " + tmp2 +" M ="+ m);
            if (tmp1-m==0){
                return n1;
            }else if(tmp1-m!=0 && tmp2-m!=0){
                return -1;
            }
            if (tmp2-m==0){
                return n2;

            }else if(tmp1-m!=0 && tmp2-m!=0){
                return -1;
            }

        }else if (D == 0){
            n1=-1/2;
            return Math.abs(n1);
        } else if (D<0){
            return -1;
        }
        return n1;
    }

}
