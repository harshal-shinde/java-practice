package java8;

import java.util.concurrent.*;

class CompletableFuture1 {
    public static void main(String[] args) throws Exception
    {
        CompletableFuture<String> greetingFuture
                = CompletableFuture.supplyAsync(() -> {
            // some async computation
            return "Hello from CompletableFuture";
        });

        System.out.println(greetingFuture.get());
    }
}
