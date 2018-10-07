package phone;

public class Wang implements CallBack {
    private Li li; //maintaining a reference
    public Wang(Li li){
        this.li = li;
    }

    public void askQuestion(final String question){
        //实现的是异步方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                li.executeMessage(Wang.this,question);
            }
        }).start();
        this.play();//同时调用后面的play()
    }

    public void play(){
        System.out.println("我要去逛街了..");
    }
    @Override
    public void solve(String result) {
        System.out.println("小李告诉小王答案是："+result);
    }
}
