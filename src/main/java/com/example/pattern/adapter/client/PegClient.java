package com.example.pattern.adapter.client;

import com.example.pattern.adapter.RoundHole;
import com.example.pattern.adapter.RoundPeg;
import com.example.pattern.adapter.SquarePeg;
import com.example.pattern.adapter.SquarePegAdapter;

public class PegClient {

    public void clientAdpater() {
        RoundHole hole = new RoundHole(5);
        RoundPeg peg = new RoundPeg(5);
        System.out.println("hole is fit :: " + hole.isFit(peg));

        SquarePeg smallSqPeg = new SquarePeg(5);
        SquarePeg largeSqPeg = new SquarePeg(10);

        SquarePegAdapter smallAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeAdapter = new SquarePegAdapter(largeSqPeg);

        System.out.println("hole is fit :: " + hole.isFit(smallAdapter));
        System.out.println("hole is fit :: " + hole.isFit(largeAdapter));
    }
}
