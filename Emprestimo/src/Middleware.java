public abstract class Middleware{
    private Middleware next;

    public static Middleware link(Middleware first, Middleware... chain){
        Middleware head = first;
        for (Middleware nextInChain: chain){
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public abstract boolean check(Cliente cliente, double emprestimo);

    protected boolean checkNext(Cliente cliente, double emprestimo) {
        if (next == null) {
            return true;
        }
        return next.check(cliente, emprestimo);
    }
}
