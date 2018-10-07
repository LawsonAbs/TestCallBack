package phone;

public class TestMain {
    public static void main(String[] args) {
        Li li = new Li();
        /*
        1.wang持有一个li的对象
        2.wang调用了自己的方法askQuestion()
        3.askQuestion()方法中继续调用li的方法executeMessage(phone.Wang.this,question)
        4.executeMessage(phone.CallBack,String)参数类型是CallBack与String。接着Wang实现了CallBack接口，所以Wang可以作为参数传递进去
        5.接着在executeMessage中调用callback的solve()方法
        6.又因为Wang实现了该接口，所以会调用子类的solve()方法，即Wang中的solve()方法，最后返回结果。

         整个调用过程，总结如下：
         askQuestion()[phone.Wang] -> executeMessage[phone.Li] -> solve[phone.Wang]
         */
        Wang wang = new Wang(li);
        wang.askQuestion("1 + 1 = ?");
    }
}
