package org.example.vehicle_Strategy;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NavigationSystem {
    private  String navigation;
    public  void proccess(INavigationStrategy navigationStrategy){
        if(navigationStrategy.applyNavigate(navigation)){
            System.out.println("---Navigation known---- ");
        }else {
            System.out.println("----Navigation unknown---- ");
        }
    }

}
