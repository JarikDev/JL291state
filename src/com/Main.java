package com;

public class Main {
    public static void main(String[] args) {
        Context context=new Context(new LoverCaseState(),"Jarik");
        context.doAction();
        context.setState(new UpperCaseState());
        context.doAction();
    }
}
interface State{
    void doAction(Context context);
}
class LoverCaseState implements State{

    @Override
    public void doAction(Context context) {
        System.out.println(context.name.toLowerCase());
    }
}

class UpperCaseState implements State{

    @Override
    public void doAction(Context context) {
        System.out.println(context.name.toUpperCase());
    }
}
class Context{
    State state;
    String name;

    public void setState(State state) {
        this.state = state;
    }

    public Context(State state, String name) {
        this.state = state;
        this.name = name;
    }

    void doAction(){
        state.doAction(this);
    }
}



























