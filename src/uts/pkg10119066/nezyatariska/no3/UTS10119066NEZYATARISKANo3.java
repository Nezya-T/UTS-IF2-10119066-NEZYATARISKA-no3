/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.pkg10119066.nezyatariska.no3;

/**
 *
 * @author Neyza-T
 * Nama     : Nezya Tariska
 * Kelas    : IF2
 * NIM      : 10119066
 */
public class UTS10119066NEZYATARISKANo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         RnB x = new RnB();
        x.genreBlues("Jimmy Hendrik");
        RnB y = new RnB();
        y.genreJazz("Chad Baker");
        Folk q = new Folk();
        q.genreFolk("Bob Dylan");
        Rockabilly w = new Rockabilly();
        w.genreRockabilly("Elvis Presley");
        
        Hardrock e= new Hardrock();
        e.genreProgressiveRock("DreamTheater");
        Hardrock r = new Hardrock();
        r.genrePsychedelicRock("The Doors");
        Hardrock t = new Hardrock();
        t.genrePopRock("Kiss");
        
        Metal u = new Metal();
        u.genrePunk("MXPX");
        Metal i = new Metal();
        i.genreHeavyMetal("METALLICA");
        
        GrindCore o = new GrindCore();
        o.genreGrindCore("Mesin Tempur");
        DeathMetal p = new DeathMetal();
        p.genreDeathMetal("JASAD");
        DeathCoreKepiting a = new DeathCoreKepiting();
        a.genreDeathCoreKepiting("Revenge The Fate");
        BlackMetal s = new BlackMetal();
        s.genreBlackMetal("Behemoth");
        NewSkul d = new NewSkul();
        d.genreNewSkul("HATEBREED");
    }
    
}
