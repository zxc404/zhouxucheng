package service;


import domain.food.Pork;
import domain.food.SourVegDumpling;
import domain.food.VegDumpling;
import view.CustomerView;

/**
 * @author Zxc
 * @version 1.0
 */
public class FoodService {

    private static int num = 0;

    public boolean isOrder(double veg,double sveg,double pork){
        if (veg> VegDumpling.TOL){
            System.out.println("素三鲜水饺份量超出限额");
            return false;
        }else if (sveg> SourVegDumpling.TOL){
            System.out.println("酸菜油吱啦水饺份量超出限额");
            return false;
        }else if (pork> Pork.TOL){
            System.out.println("猪肉份量超出限额");
            return false;
        }
        return true;
    }

    public double getBill(double veg,double sveg,double pork){
        return veg*12* VegDumpling.DISCOUNT*0.1+
                sveg*12* SourVegDumpling.DISCOUNT*0.1+
                pork*16* Pork.DISCOUNT*0.1;
    }

    public void upFoodBill(double veg,double sveg,double pork){
        CustomerView.sumFoodBill[0]+=veg*12* VegDumpling.DISCOUNT*0.1;
        CustomerView.sumFoodBill[1]+=sveg*12* SourVegDumpling.DISCOUNT*0.1;
        CustomerView.sumFoodBill[2]+=pork*16* VegDumpling.DISCOUNT*0.1;
    }

    public void upFoodBill(double veg,double sveg,double pork,double discount){
        CustomerView.sumFoodBill[0]+=veg*12* VegDumpling.DISCOUNT*0.1*discount;
        CustomerView.sumFoodBill[1]+=sveg*12* SourVegDumpling.DISCOUNT*0.1*discount;
        CustomerView.sumFoodBill[2]+=pork*16* VegDumpling.DISCOUNT*0.1*discount;
    }

    public boolean updateFoodTOL(double veg,double sveg,double pork){
        if (!( VegDumpling.TOL < veg||
                SourVegDumpling.TOL < sveg||
                Pork.TOL < pork)) {
            VegDumpling.TOL -= veg;
            SourVegDumpling.TOL -= sveg;
            Pork.TOL -= pork;
            return true;
        } else return false;
    }

}
