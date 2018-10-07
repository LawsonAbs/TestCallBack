package phone;

/**
 *
 */
public class Li {
    public void executeMessage(CallBack callBack,String question){
        System.out.println("小王的问题是：-->"+question);
        for(int i = 0;i<100000;i++){

        }
        String result= "2";
        callBack.solve(result);
    }
}
