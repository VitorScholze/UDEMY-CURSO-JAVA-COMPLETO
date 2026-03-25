package PredicateComposicao;

import java.util.function.Predicate;

public class PredicadoComposicao{
    public static void main(String[] args) {
        Predicate<Integer> isPar = num -> num % 2 ==0;
        Predicate<Integer>isTresDigitos = num -> num >100 & num < 999;

        System.err.println(isPar.test(40));
        System.out.println(isTresDigitos.test(101));

        System.out.println(isPar.and(isTresDigitos).test(96));
        System.out.println(isPar.and(isTresDigitos).negate().test(96));
        System.out.println(isPar.or(isTresDigitos).test(123));

        
    }
}