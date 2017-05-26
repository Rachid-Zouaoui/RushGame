package randoop;

import junit.framework.*;

public class RandoopTest3 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test1");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 0, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(0, 0, 1);
    boolean var16 = var0.moveCar(1, 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test2");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(100, 1, 0);
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar((-1), 1, 1);
    boolean var28 = var0.moveCar(1, 1, 100);
    boolean var32 = var0.moveCar(0, 10, (-1));
    boolean var36 = var0.moveCar(1, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test3");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var14 = var0.moveCar(1, 100, 1);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar((-1), 10, 1);
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(10, 100, 10);
    boolean var25 = var0.redCarAtExit();
    boolean var29 = var0.moveCar((-1), 100, 10);
    boolean var33 = var0.moveCar(0, 0, 100);
    boolean var37 = var0.moveCar(1, 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test4");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(1, 1, (-1));
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar((-1), 1, 1);
    boolean var21 = var0.redCarAtExit();
    boolean var25 = var0.moveCar(1, (-1), 1);
    boolean var26 = var0.redCarAtExit();
    boolean var27 = var0.redCarAtExit();
    boolean var31 = var0.moveCar(10, 10, (-1));
    boolean var32 = var0.redCarAtExit();
    boolean var36 = var0.moveCar(10, 10, 100);
    boolean var40 = var0.moveCar(100, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test5");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var13 = var0.moveCar(1, 100, 10);
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar(10, 1, 100);
    boolean var22 = var0.moveCar(10, 1, 1);
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(0, 100, 0);
    boolean var31 = var0.moveCar(10, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test6");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar((-1), 0, 100);
    boolean var14 = var0.moveCar(100, 0, 1);
    boolean var18 = var0.moveCar(100, 0, 0);
    boolean var22 = var0.moveCar((-1), (-1), 100);
    boolean var26 = var0.moveCar(10, (-1), (-1));
    boolean var30 = var0.moveCar(100, 100, 10);
    boolean var31 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test7");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(100, 0, 10);
    boolean var5 = var0.redCarAtExit();
    boolean var9 = var0.moveCar(1, (-1), (-1));
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar(100, 0, 100);
    boolean var18 = var0.moveCar(0, (-1), (-1));
    boolean var22 = var0.moveCar(10, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test8");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, 0, 0);
    boolean var13 = var0.moveCar((-1), 10, 1);
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar((-1), 1, 0);
    boolean var19 = var0.redCarAtExit();
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(0, 1, 1);
    boolean var28 = var0.moveCar(1, 0, 100);
    boolean var29 = var0.redCarAtExit();
    boolean var33 = var0.moveCar(100, 1, 100);
    boolean var34 = var0.redCarAtExit();
    boolean var38 = var0.moveCar(100, 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test9");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, (-1), 100);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar((-1), 100, 1);
    boolean var20 = var0.moveCar(1, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test10");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var14 = var0.moveCar((-1), 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test11");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var7 = var0.redCarAtExit();
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar((-1), 0, 10);
    boolean var16 = var0.moveCar(100, 100, 100);
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(10, 100, 10);
    boolean var25 = var0.moveCar(100, 1, (-1));
    boolean var26 = var0.redCarAtExit();
    boolean var30 = var0.moveCar(10, 10, 100);
    boolean var31 = var0.redCarAtExit();
    boolean var35 = var0.moveCar(10, 0, 0);
    boolean var36 = var0.redCarAtExit();
    boolean var40 = var0.moveCar(100, 0, 100);
    boolean var44 = var0.moveCar(1, 100, 10);
    boolean var48 = var0.moveCar(100, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test12");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(10, 10, 100);
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(100, 10, 10);
    boolean var28 = var0.moveCar(1, 0, 100);
    boolean var29 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test13");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(0, (-1), (-1));
    boolean var14 = var0.moveCar((-1), 100, 10);
    boolean var18 = var0.moveCar(1, (-1), 10);
    boolean var22 = var0.moveCar(1, 1, 100);
    boolean var26 = var0.moveCar(0, 10, 1);
    boolean var30 = var0.moveCar(0, 10, 1);
    boolean var31 = var0.redCarAtExit();
    boolean var32 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test14");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar(0, 0, 0);
    boolean var9 = var0.redCarAtExit();
    boolean var13 = var0.moveCar((-1), 1, 10);
    boolean var17 = var0.moveCar(0, 100, 100);
    boolean var21 = var0.moveCar(0, (-1), (-1));
    boolean var25 = var0.moveCar(0, 10, 10);
    boolean var29 = var0.moveCar(10, 100, (-1));
    boolean var33 = var0.moveCar(100, 100, (-1));
    boolean var37 = var0.moveCar((-1), 10, 0);
    boolean var38 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test15");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(10, 1, 1);
    boolean var15 = var0.moveCar(100, 0, (-1));
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(0, (-1), 0);
    boolean var25 = var0.moveCar(0, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test16");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var13 = var0.moveCar(0, (-1), 0);
    boolean var17 = var0.moveCar(0, (-1), 0);
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(1, 100, 100);
    boolean var26 = var0.moveCar(0, 100, 100);
    boolean var27 = var0.redCarAtExit();
    boolean var28 = var0.redCarAtExit();
    boolean var29 = var0.redCarAtExit();
    boolean var30 = var0.redCarAtExit();
    boolean var31 = var0.redCarAtExit();
    boolean var32 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test17");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(1, 100, 10);
    boolean var18 = var0.moveCar(1, 100, 0);
    boolean var22 = var0.moveCar((-1), (-1), 10);
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(0, 0, (-1));
    boolean var31 = var0.moveCar(1, 100, 0);
    boolean var32 = var0.redCarAtExit();
    boolean var33 = var0.redCarAtExit();
    boolean var37 = var0.moveCar(1, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test18");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar((-1), 0, 100);
    boolean var14 = var0.moveCar(100, 0, 1);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(0, 1, 1);
    boolean var23 = var0.moveCar((-1), 100, 10);
    boolean var27 = var0.moveCar(1, 100, 100);
    boolean var31 = var0.moveCar(100, 100, (-1));
    boolean var32 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test19");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar((-1), 0, 0);
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test20");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(100, 10, 1);
    boolean var13 = var0.moveCar(0, 100, (-1));
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(1, 1, 1);
    boolean var25 = var0.moveCar(10, 10, 100);
    boolean var29 = var0.moveCar((-1), 1, (-1));
    boolean var33 = var0.moveCar((-1), 0, 1);
    boolean var37 = var0.moveCar((-1), 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test21");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, (-1), 100);
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar(100, 100, 0);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar((-1), 10, 1);
    boolean var23 = var0.moveCar(100, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test22");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var13 = var0.moveCar(0, (-1), 0);
    boolean var17 = var0.moveCar(0, (-1), 0);
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(1, 100, 100);
    boolean var26 = var0.moveCar(0, 100, 100);
    boolean var27 = var0.redCarAtExit();
    boolean var28 = var0.redCarAtExit();
    boolean var29 = var0.redCarAtExit();
    boolean var30 = var0.redCarAtExit();
    boolean var34 = var0.moveCar(10, 1, (-1));
    boolean var35 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test23");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var13 = var0.moveCar(1, 100, 10);
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(10, 1, 100);
    boolean var23 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test24");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var14 = var0.moveCar(1, 100, 1);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar((-1), 10, 1);
    boolean var23 = var0.moveCar(1, 10, 1);
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar(10, 0, 10);
    boolean var32 = var0.moveCar(1, 1, 100);
    boolean var36 = var0.moveCar(1, (-1), 10);
    boolean var40 = var0.moveCar((-1), 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test25");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar((-1), 0, (-1));
    boolean var15 = var0.moveCar(100, 1, 0);
    boolean var19 = var0.moveCar(1, (-1), 0);
    boolean var20 = var0.redCarAtExit();
    boolean var21 = var0.redCarAtExit();
    boolean var25 = var0.moveCar(100, 10, 0);
    boolean var29 = var0.moveCar((-1), 10, 100);
    boolean var33 = var0.moveCar(100, 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test26");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(100, 0, 100);
    boolean var16 = var0.moveCar((-1), 1, 100);
    boolean var17 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test27");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(100, 1, 0);
    boolean var21 = var0.moveCar(0, 1, 10);
    boolean var22 = var0.redCarAtExit();
    boolean var23 = var0.redCarAtExit();
    boolean var24 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test28");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(100, 1, 0);
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(100, (-1), 1);
    boolean var26 = var0.moveCar(10, 100, 0);
    boolean var27 = var0.redCarAtExit();
    boolean var31 = var0.moveCar((-1), (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test29");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, (-1), 100);
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar((-1), 10, 0);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(100, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test30");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var4 = var0.redCarAtExit();
    boolean var5 = var0.redCarAtExit();
    boolean var9 = var0.moveCar((-1), 1, 1);
    boolean var13 = var0.moveCar(10, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test31");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 0);
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(0, 0, (-1));
    boolean var15 = var0.moveCar(0, 10, 0);
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(0, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test32");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var14 = var0.moveCar(1, 100, 1);
    boolean var18 = var0.moveCar(10, 0, 10);
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(10, 100, 1);
    boolean var24 = var0.redCarAtExit();
    boolean var25 = var0.redCarAtExit();
    boolean var26 = var0.redCarAtExit();
    boolean var27 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test33");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(10, 1, 10);
    boolean var9 = var0.moveCar((-1), (-1), 10);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(0, 100, 0);
    boolean var19 = var0.moveCar(10, 0, 1);
    boolean var23 = var0.moveCar(100, 1, 1);
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar((-1), 10, 0);
    boolean var32 = var0.moveCar((-1), 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test34");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar((-1), 0, (-1));
    boolean var15 = var0.moveCar(100, 1, 0);
    boolean var19 = var0.moveCar(1, (-1), 0);
    boolean var23 = var0.moveCar(100, 10, 0);
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar(10, 1, 10);
    boolean var29 = var0.redCarAtExit();
    boolean var33 = var0.moveCar(0, (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test35");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar((-1), 0, 100);
    boolean var12 = var0.moveCar(10, 10, 1);
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(100, 100, (-1));
    boolean var21 = var0.moveCar((-1), 100, (-1));
    boolean var22 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test36");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar((-1), (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test37");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(0, 1, 100);
    boolean var10 = var0.moveCar((-1), 1, 10);
    boolean var14 = var0.moveCar(10, 100, (-1));
    boolean var18 = var0.moveCar(0, 1, 1);
    boolean var19 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test38");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(10, 1, 10);
    boolean var9 = var0.moveCar((-1), (-1), 10);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(0, 100, 0);
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(0, (-1), 100);
    boolean var24 = var0.moveCar((-1), (-1), 1);
    boolean var28 = var0.moveCar(10, 10, 1);
    boolean var32 = var0.moveCar(0, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test39");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(100, 10, 1);
    boolean var13 = var0.moveCar(0, 100, (-1));
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(0, 10, (-1));
    boolean var24 = var0.moveCar(0, 1, (-1));
    boolean var25 = var0.redCarAtExit();
    boolean var26 = var0.redCarAtExit();
    boolean var30 = var0.moveCar(10, 0, 10);
    boolean var31 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test40");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(100, 10, 1);
    boolean var13 = var0.moveCar(10, 100, 1);
    boolean var17 = var0.moveCar(100, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test41");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var16 = var0.moveCar(0, 0, (-1));
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(100, 0, (-1));
    boolean var25 = var0.moveCar(100, 1, 10);
    boolean var29 = var0.moveCar(10, 10, 100);
    boolean var33 = var0.moveCar(0, 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test42");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(100, 10, 1);
    boolean var13 = var0.moveCar(0, 100, (-1));
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(0, 10, (-1));
    boolean var24 = var0.moveCar(0, 1, (-1));
    boolean var28 = var0.moveCar(1, (-1), 10);
    boolean var32 = var0.moveCar(1, (-1), 10);
    boolean var33 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test43");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar(0, 0, 0);
    boolean var12 = var0.moveCar(100, 1, 1);
    boolean var16 = var0.moveCar((-1), 1, 10);
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(0, 100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test44");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(1, 1, (-1));
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar((-1), 10, 100);
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(10, 100, 0);
    boolean var28 = var0.moveCar(100, 1, 10);
    boolean var32 = var0.moveCar(100, 1, 10);
    boolean var36 = var0.moveCar(1, 0, (-1));
    boolean var37 = var0.redCarAtExit();
    boolean var41 = var0.moveCar(1, 10, 1);
    boolean var45 = var0.moveCar(10, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test45");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar((-1), 0, 100);
    boolean var12 = var0.moveCar(10, 10, 1);
    boolean var16 = var0.moveCar(1, 100, 10);
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(1, (-1), 0);
    boolean var22 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test46");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(10, 1, 0);
    boolean var18 = var0.moveCar(10, (-1), (-1));
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(1, 100, 0);
    boolean var27 = var0.moveCar(10, 10, 10);
    boolean var28 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test47");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 0, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar((-1), 0, (-1));
    boolean var18 = var0.moveCar(100, (-1), 100);
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(0, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test48");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(10, (-1), 1);
    boolean var14 = var0.moveCar((-1), 10, 100);
    boolean var18 = var0.moveCar(0, 0, 0);
    boolean var19 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test49");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(1, 100, 10);
    boolean var18 = var0.moveCar(1, 100, 0);
    boolean var22 = var0.moveCar((-1), (-1), 10);
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(0, 0, (-1));
    boolean var31 = var0.moveCar(0, 10, 10);
    boolean var32 = var0.redCarAtExit();
    boolean var33 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test50");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(100, 10, 1);
    boolean var18 = var0.moveCar(0, 0, 0);
    boolean var22 = var0.moveCar(100, (-1), 10);
    boolean var23 = var0.redCarAtExit();
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar(10, 10, 0);
    boolean var29 = var0.redCarAtExit();
    boolean var33 = var0.moveCar(1, (-1), 1);
    boolean var34 = var0.redCarAtExit();
    boolean var35 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test51");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar(100, 10, 0);
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(1, 0, 10);
    boolean var25 = var0.moveCar((-1), 100, 0);
    boolean var26 = var0.redCarAtExit();
    boolean var30 = var0.moveCar(1, 1, 100);
    boolean var34 = var0.moveCar(100, (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test52");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(100, 10, 1);
    boolean var13 = var0.moveCar(0, 100, (-1));
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(0, 10, (-1));
    boolean var24 = var0.moveCar(0, 1, (-1));
    boolean var25 = var0.redCarAtExit();
    boolean var26 = var0.redCarAtExit();
    boolean var27 = var0.redCarAtExit();
    boolean var31 = var0.moveCar(100, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test53");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar((-1), (-1), (-1));
    boolean var21 = var0.moveCar(10, 0, 0);
    boolean var25 = var0.moveCar(1, 100, 10);
    boolean var29 = var0.moveCar(10, 100, 100);
    boolean var33 = var0.moveCar(100, (-1), 1);
    boolean var37 = var0.moveCar((-1), 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test54");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, (-1), 100);
    boolean var13 = var0.moveCar((-1), 10, 0);
    boolean var17 = var0.moveCar(1, 100, 1);
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar((-1), 10, 100);
    boolean var27 = var0.moveCar(1, 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test55");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var14 = var0.moveCar(1, 100, 1);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar((-1), 10, 1);
    boolean var23 = var0.moveCar(1, 10, 1);
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar(10, 0, 10);
    boolean var29 = var0.redCarAtExit();
    boolean var30 = var0.redCarAtExit();
    boolean var31 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test56");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(100, 0, 10);
    boolean var5 = var0.redCarAtExit();
    boolean var9 = var0.moveCar(1, (-1), (-1));
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar((-1), 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test57");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var7 = var0.redCarAtExit();
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar((-1), 0, 10);
    boolean var16 = var0.moveCar(100, 100, 100);
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(10, 10, (-1));
    boolean var25 = var0.moveCar(0, 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test58");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar(10, 1, 10);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(10, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test59");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, 0, 0);
    boolean var13 = var0.moveCar((-1), 10, 1);
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar((-1), 1, 0);
    boolean var19 = var0.redCarAtExit();
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(0, 1, 1);
    boolean var28 = var0.moveCar(1, 0, 100);
    boolean var29 = var0.redCarAtExit();
    boolean var30 = var0.redCarAtExit();
    boolean var34 = var0.moveCar(100, 10, (-1));
    boolean var38 = var0.moveCar(10, 0, 10);
    boolean var42 = var0.moveCar(0, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test60");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(100, 10, 1);
    boolean var13 = var0.moveCar(0, 100, (-1));
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(1, 1, 1);
    boolean var25 = var0.moveCar(0, 1, 1);
    boolean var26 = var0.redCarAtExit();
    boolean var30 = var0.moveCar(100, (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test61");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(10, 10, 100);
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(1, 0, (-1));
    boolean var26 = var0.moveCar(1, 1, 100);
    boolean var30 = var0.moveCar(100, (-1), 100);
    boolean var31 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test62");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var16 = var0.moveCar(0, 0, (-1));
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(100, 0, (-1));
    boolean var22 = var0.redCarAtExit();
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(10, 100, 100);
    boolean var31 = var0.moveCar(10, 100, 10);
    boolean var35 = var0.moveCar(10, 0, 1);
    boolean var36 = var0.redCarAtExit();
    boolean var40 = var0.moveCar(100, 100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test63");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar((-1), 1, 100);
    boolean var18 = var0.moveCar(0, 1, 1);
    boolean var22 = var0.moveCar(100, 100, 1);
    boolean var26 = var0.moveCar(0, 100, 100);
    boolean var30 = var0.moveCar(10, (-1), 1);
    boolean var34 = var0.moveCar(1, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test64");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(100, 1, 0);
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(10, 0, 0);
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar(1, 100, 1);
    boolean var32 = var0.moveCar(0, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test65");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(1, 1, (-1));
    boolean var18 = var0.moveCar(10, (-1), 1);
    boolean var19 = var0.redCarAtExit();
    boolean var20 = var0.redCarAtExit();
    boolean var21 = var0.redCarAtExit();
    boolean var25 = var0.moveCar(1, (-1), 100);
    boolean var26 = var0.redCarAtExit();
    boolean var30 = var0.moveCar(1, 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test66");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(10, 1, 1);
    boolean var15 = var0.moveCar(100, 0, (-1));
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(1, (-1), 10);
    boolean var21 = var0.redCarAtExit();
    boolean var22 = var0.redCarAtExit();
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(1, 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test67");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(10, 1, 10);
    boolean var9 = var0.moveCar((-1), (-1), 10);
    boolean var13 = var0.moveCar(1, 0, (-1));
    boolean var17 = var0.moveCar(100, 10, 1);
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(10, 10, 1);
    boolean var26 = var0.moveCar(0, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test68");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(10, 1, 1);
    boolean var15 = var0.moveCar((-1), 10, 10);
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(10, (-1), 1);
    boolean var24 = var0.moveCar((-1), 0, 1);
    boolean var25 = var0.redCarAtExit();
    boolean var29 = var0.moveCar(1, 1, 1);
    boolean var33 = var0.moveCar(10, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test69");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar(100, 10, 0);
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(0, 10, 10);
    boolean var24 = var0.moveCar(0, 0, (-1));
    boolean var25 = var0.redCarAtExit();
    boolean var26 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test70");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 0, 10);
    boolean var11 = var0.moveCar(1, (-1), 100);
    boolean var15 = var0.moveCar(1, 0, (-1));
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(0, 100, 100);
    boolean var24 = var0.moveCar(10, 10, 100);
    boolean var28 = var0.moveCar(10, 10, 1);
    boolean var29 = var0.redCarAtExit();
    boolean var30 = var0.redCarAtExit();
    boolean var31 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test71");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 0, 10);
    boolean var11 = var0.moveCar(1, (-1), 100);
    boolean var15 = var0.moveCar(1, 0, (-1));
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar((-1), 1, 0);
    boolean var22 = var0.redCarAtExit();
    boolean var26 = var0.moveCar(0, 10, 100);
    boolean var27 = var0.redCarAtExit();
    boolean var28 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test72");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(10, 1, 0);
    boolean var18 = var0.moveCar((-1), 0, 10);
    boolean var22 = var0.moveCar(10, 100, 10);
    boolean var26 = var0.moveCar(1, 100, 1);
    boolean var30 = var0.moveCar(10, 1, 0);
    boolean var34 = var0.moveCar(10, 100, 10);
    boolean var35 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test73");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(0, 1, 10);
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(0, 10, (-1));
    boolean var19 = var0.moveCar((-1), 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test74");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(100, 10, 1);
    boolean var13 = var0.moveCar(0, 100, (-1));
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(1, 1, 1);
    boolean var25 = var0.moveCar(10, 10, 100);
    boolean var26 = var0.redCarAtExit();
    boolean var30 = var0.moveCar(1, 0, 10);
    boolean var34 = var0.moveCar(10, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test75");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var13 = var0.moveCar(10, 1, 100);
    boolean var17 = var0.moveCar(100, 1, 0);
    boolean var18 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test76");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var11 = var0.moveCar((-1), 0, 100);
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar((-1), 10, 1);
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(10, 10, (-1));
    boolean var27 = var0.moveCar((-1), (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test77");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(100, 10, 1);
    boolean var13 = var0.moveCar(0, 100, (-1));
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(0, 10, 0);
    boolean var26 = var0.moveCar(10, 10, 0);
    boolean var30 = var0.moveCar(10, 0, 10);
    boolean var31 = var0.redCarAtExit();
    boolean var35 = var0.moveCar(1, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test78");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar((-1), 100, (-1));
    boolean var5 = var0.redCarAtExit();
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(1, 1, 100);
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(1, 1, (-1));
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(100, (-1), 100);
    boolean var26 = var0.moveCar(1, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test79");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 0, (-1));
    boolean var11 = var0.moveCar((-1), 100, 100);
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(10, (-1), 10);
    boolean var21 = var0.moveCar(10, 0, 1);
    boolean var22 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test80");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(1, 100, 10);
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar((-1), (-1), 0);
    boolean var21 = var0.redCarAtExit();
    boolean var22 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test81");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(10, 1, 1);
    boolean var15 = var0.moveCar((-1), 10, 10);
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(10, (-1), 1);
    boolean var24 = var0.moveCar(1, 10, 0);
    boolean var25 = var0.redCarAtExit();
    boolean var26 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test82");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var16 = var0.moveCar(10, 10, 1);
    boolean var20 = var0.moveCar(1, (-1), 0);
    boolean var24 = var0.moveCar(0, 100, (-1));
    boolean var25 = var0.redCarAtExit();
    boolean var26 = var0.redCarAtExit();
    boolean var30 = var0.moveCar(1, 1, 1);
    boolean var34 = var0.moveCar((-1), 100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test83");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar((-1), 1, 100);
    boolean var18 = var0.moveCar(0, 1, 1);
    boolean var22 = var0.moveCar(10, 100, 100);
    boolean var23 = var0.redCarAtExit();
    boolean var24 = var0.redCarAtExit();
    boolean var25 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test84");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar((-1), 10, (-1));
    boolean var21 = var0.moveCar(100, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test85");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 10, (-1));
    boolean var14 = var0.moveCar(0, 100, 10);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(100, 0, 1);
    boolean var23 = var0.moveCar(100, (-1), 10);
    boolean var24 = var0.redCarAtExit();
    boolean var25 = var0.redCarAtExit();
    boolean var29 = var0.moveCar(100, 1, 10);
    boolean var30 = var0.redCarAtExit();
    boolean var31 = var0.redCarAtExit();
    boolean var32 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test86");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar((-1), (-1), 10);
    boolean var18 = var0.moveCar(0, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test87");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar((-1), 0, 100);
    boolean var12 = var0.moveCar(1, 100, 0);
    boolean var16 = var0.moveCar(100, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test88");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 0, (-1));
    boolean var11 = var0.moveCar((-1), 100, 100);
    boolean var15 = var0.moveCar((-1), 0, (-1));
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(10, 1, 1);
    boolean var24 = var0.moveCar(0, 1, (-1));
    boolean var28 = var0.moveCar(100, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test89");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar((-1), 0, 0);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(10, 0, (-1));
    boolean var23 = var0.moveCar(10, 0, 100);
    boolean var27 = var0.moveCar(0, 0, 1);
    boolean var28 = var0.redCarAtExit();
    boolean var29 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test90");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar((-1), 0, (-1));
    boolean var15 = var0.moveCar(100, 1, 0);
    boolean var19 = var0.moveCar(1, (-1), 0);
    boolean var23 = var0.moveCar(100, 10, 0);
    boolean var27 = var0.moveCar((-1), (-1), (-1));
    boolean var31 = var0.moveCar((-1), 1, (-1));
    boolean var35 = var0.moveCar(100, (-1), 1);
    boolean var39 = var0.moveCar(100, 10, (-1));
    boolean var43 = var0.moveCar(1, 100, 100);
    boolean var47 = var0.moveCar(0, 0, (-1));
    boolean var51 = var0.moveCar(0, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test91");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(1, 1, (-1));
    boolean var18 = var0.moveCar(100, 10, 10);
    boolean var22 = var0.moveCar(100, 1, 0);
    boolean var26 = var0.moveCar((-1), 100, 0);
    boolean var27 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test92");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(10, 1, 0);
    boolean var18 = var0.moveCar(10, (-1), (-1));
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(10, 100, 1);
    boolean var27 = var0.moveCar((-1), 0, 10);
    boolean var31 = var0.moveCar(100, (-1), 0);
    boolean var35 = var0.moveCar(1, 0, 1);
    boolean var36 = var0.redCarAtExit();
    boolean var37 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test93");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar((-1), 0, 100);
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(0, 0, 100);
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar((-1), 100, (-1));
    boolean var25 = var0.moveCar(10, (-1), 1);
    boolean var26 = var0.redCarAtExit();
    boolean var27 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test94");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar((-1), 0, 0);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(10, 0, (-1));
    boolean var23 = var0.moveCar(10, 0, 100);
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar(1, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test95");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 0, 1);
    boolean var10 = var0.moveCar(10, 1, 1);
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(1, 100, 100);
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(1, 1, 0);
    boolean var24 = var0.moveCar(100, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test96");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(100, 1, 0);
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(0, 100, 100);
    boolean var24 = var0.redCarAtExit();
    boolean var25 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test97");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var13 = var0.moveCar(1, 100, 10);
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(1, (-1), 100);
    boolean var23 = var0.moveCar(1, 10, 1);
    boolean var24 = var0.redCarAtExit();
    boolean var25 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test98");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(10, 1, 0);
    boolean var18 = var0.moveCar(100, 1, 1);
    boolean var22 = var0.moveCar(0, 0, (-1));
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar((-1), 0, 0);
    boolean var28 = var0.redCarAtExit();
    boolean var29 = var0.redCarAtExit();
    boolean var33 = var0.moveCar(0, 10, 10);
    boolean var34 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test99");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, (-1), 100);
    boolean var13 = var0.moveCar((-1), 10, 0);
    boolean var17 = var0.moveCar(1, 100, 1);
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(10, 1, 100);
    boolean var23 = var0.redCarAtExit();
    boolean var24 = var0.redCarAtExit();
    boolean var25 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test100");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(10, 1, 1);
    boolean var15 = var0.moveCar((-1), 1, 10);
    boolean var19 = var0.moveCar(100, (-1), 0);
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar((-1), 1, (-1));
    boolean var28 = var0.moveCar(0, (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test101");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var5 = var0.redCarAtExit();
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(0, 0, 10);
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(10, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test102");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar((-1), 0, 100);
    boolean var12 = var0.moveCar(10, 10, 1);
    boolean var16 = var0.moveCar(0, 1, 1);
    boolean var20 = var0.moveCar((-1), 0, 100);
    boolean var24 = var0.moveCar(1, 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test103");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var14 = var0.moveCar(1, 100, 1);
    boolean var18 = var0.moveCar(10, 0, 10);
    boolean var22 = var0.moveCar(100, (-1), 1);
    boolean var26 = var0.moveCar((-1), 0, 1);
    boolean var27 = var0.redCarAtExit();
    boolean var31 = var0.moveCar((-1), 1, 100);
    boolean var32 = var0.redCarAtExit();
    boolean var33 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test104");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 0, 10);
    boolean var11 = var0.moveCar(1, (-1), 100);
    boolean var15 = var0.moveCar(100, 0, 1);
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(0, 10, 10);
    boolean var24 = var0.moveCar(0, 1, 1);
    boolean var28 = var0.moveCar(100, (-1), 1);
    boolean var32 = var0.moveCar(1, 0, (-1));
    boolean var33 = var0.redCarAtExit();
    boolean var37 = var0.moveCar(100, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test105");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(100, 1, 0);
    boolean var21 = var0.moveCar(0, 1, 10);
    boolean var25 = var0.moveCar(0, 10, (-1));
    boolean var29 = var0.moveCar(1, 100, 1);
    boolean var33 = var0.moveCar(10, 1, (-1));
    boolean var37 = var0.moveCar((-1), 10, 100);
    boolean var38 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test106");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, (-1), 100);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar((-1), 0, 100);
    boolean var19 = var0.moveCar(10, (-1), 1);
    boolean var23 = var0.moveCar(1, 10, 10);
    boolean var24 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test107");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 0, (-1));
    boolean var11 = var0.moveCar(10, 10, 0);
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar(10, 1, 1);
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(0, 0, 0);
    boolean var22 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test108");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var14 = var0.moveCar(1, 100, 1);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar((-1), 10, 1);
    boolean var23 = var0.moveCar(1, 10, 1);
    boolean var27 = var0.moveCar(0, 0, (-1));
    boolean var28 = var0.redCarAtExit();
    boolean var32 = var0.moveCar(10, 0, 10);
    boolean var33 = var0.redCarAtExit();
    boolean var34 = var0.redCarAtExit();
    boolean var38 = var0.moveCar((-1), 100, 0);
    boolean var42 = var0.moveCar((-1), 0, 1);
    boolean var43 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test109");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 10, (-1));
    boolean var14 = var0.moveCar(0, 100, 10);
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(10, 0, 100);
    boolean var21 = var0.redCarAtExit();
    boolean var25 = var0.moveCar(0, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test110");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var13 = var0.moveCar(0, (-1), 0);
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar(1, 1, 10);
    boolean var22 = var0.moveCar((-1), (-1), (-1));
    boolean var26 = var0.moveCar((-1), (-1), 100);
    boolean var30 = var0.moveCar(10, 100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test111");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 0, 1);
    boolean var10 = var0.moveCar(10, 1, 1);
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(1, 100, 100);
    boolean var19 = var0.moveCar((-1), 1, (-1));
    boolean var23 = var0.moveCar(1, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test112");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(1, 1, 100);
    boolean var25 = var0.moveCar(0, (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test113");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar((-1), 0, 100);
    boolean var12 = var0.moveCar(10, 10, 1);
    boolean var16 = var0.moveCar(1, 100, 10);
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar((-1), 0, 1);
    boolean var25 = var0.moveCar(10, 0, (-1));
    boolean var29 = var0.moveCar(1, 100, 1);
    boolean var33 = var0.moveCar(1, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test114");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(100, 10, 1);
    boolean var18 = var0.moveCar(1, 1, 10);
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar((-1), (-1), 1);
    boolean var27 = var0.moveCar(1, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test115");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var16 = var0.moveCar(10, 10, 1);
    boolean var20 = var0.moveCar(1, (-1), 0);
    boolean var24 = var0.moveCar(0, 100, (-1));
    boolean var28 = var0.moveCar(100, (-1), 100);
    boolean var32 = var0.moveCar(10, 0, 1);
    boolean var33 = var0.redCarAtExit();
    boolean var34 = var0.redCarAtExit();
    boolean var35 = var0.redCarAtExit();
    boolean var39 = var0.moveCar((-1), 100, 100);
    boolean var43 = var0.moveCar(0, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test116");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, (-1), 100);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar((-1), 100, 1);
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar((-1), (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test117");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(10, 1, 1);
    boolean var15 = var0.moveCar((-1), 1, 10);
    boolean var19 = var0.moveCar((-1), 1, 0);
    boolean var23 = var0.moveCar(0, (-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test118");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var14 = var0.moveCar(1, 100, 1);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar((-1), 10, 1);
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(10, 100, 10);
    boolean var25 = var0.redCarAtExit();
    boolean var29 = var0.moveCar((-1), 100, 10);
    boolean var33 = var0.moveCar(0, 0, 100);
    boolean var34 = var0.redCarAtExit();
    boolean var35 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test119");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar((-1), 0, 100);
    boolean var12 = var0.moveCar(0, (-1), 100);
    boolean var16 = var0.moveCar(1, 10, 100);
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(100, 100, 100);
    boolean var28 = var0.moveCar(10, (-1), 1);
    boolean var29 = var0.redCarAtExit();
    boolean var33 = var0.moveCar(0, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test120");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(10, 0, 0);
    boolean var14 = var0.moveCar((-1), 1, 10);
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(10, (-1), (-1));
    boolean var25 = var0.moveCar(100, (-1), 1);
    boolean var29 = var0.moveCar(1, 100, 1);
    boolean var33 = var0.moveCar(100, 0, 1);
    boolean var34 = var0.redCarAtExit();
    boolean var35 = var0.redCarAtExit();
    boolean var39 = var0.moveCar((-1), 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test121");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var4 = var0.redCarAtExit();
    boolean var5 = var0.redCarAtExit();
    boolean var9 = var0.moveCar(0, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar((-1), 0, (-1));
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(0, 0, 0);
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar((-1), 0, (-1));
    boolean var32 = var0.moveCar(0, (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test122");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, (-1), 100);
    boolean var13 = var0.moveCar((-1), 10, 0);
    boolean var17 = var0.moveCar(1, 100, 1);
    boolean var21 = var0.moveCar(1, 1, (-1));
    boolean var22 = var0.redCarAtExit();
    boolean var23 = var0.redCarAtExit();
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar(1, (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test123");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar((-1), 0, 100);
    boolean var12 = var0.moveCar(10, 10, 1);
    boolean var16 = var0.moveCar(0, 1, 1);
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(1, (-1), (-1));
    boolean var22 = var0.redCarAtExit();
    boolean var23 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test124");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(0, 1, 100);
    boolean var10 = var0.moveCar((-1), 1, 10);
    boolean var14 = var0.moveCar(10, 100, (-1));
    boolean var18 = var0.moveCar(1, 10, 100);
    boolean var19 = var0.redCarAtExit();
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar((-1), 100, (-1));
    boolean var25 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test125");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(100, 0, 10);
    boolean var5 = var0.redCarAtExit();
    boolean var9 = var0.moveCar(1, (-1), (-1));
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar((-1), 0, 10);
    boolean var18 = var0.moveCar(10, 100, 0);
    boolean var19 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test126");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(0, 1, 10);
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(0, 10, (-1));
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(100, (-1), 0);
    boolean var21 = var0.redCarAtExit();
    boolean var22 = var0.redCarAtExit();
    boolean var26 = var0.moveCar(100, 100, 1);
    boolean var27 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test127");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar((-1), 0, 100);
    boolean var14 = var0.moveCar(100, 0, 1);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(0, 1, 1);
    boolean var23 = var0.moveCar(0, 100, 1);
    boolean var27 = var0.moveCar(0, 0, 100);
    boolean var31 = var0.moveCar(100, 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test128");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var13 = var0.redCarAtExit();
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar((-1), 100, 1);
    boolean var22 = var0.moveCar(0, 10, (-1));
    boolean var26 = var0.moveCar(100, (-1), 0);
    boolean var27 = var0.redCarAtExit();
    boolean var31 = var0.moveCar(10, 0, 1);
    boolean var32 = var0.redCarAtExit();
    boolean var36 = var0.moveCar((-1), 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test129");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 0, 1);
    boolean var10 = var0.moveCar(10, 1, 1);
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(1, 100, 100);
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test130");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var16 = var0.moveCar(10, 10, 1);
    boolean var20 = var0.moveCar(1, (-1), 0);
    boolean var24 = var0.moveCar(0, 100, (-1));
    boolean var28 = var0.moveCar(100, (-1), 100);
    boolean var32 = var0.moveCar(10, 0, 1);
    boolean var33 = var0.redCarAtExit();
    boolean var34 = var0.redCarAtExit();
    boolean var35 = var0.redCarAtExit();
    boolean var39 = var0.moveCar(10, 100, 100);
    boolean var43 = var0.moveCar(100, 1, 100);
    boolean var47 = var0.moveCar(1, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test131");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar((-1), 0, 100);
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(10, 1, 0);
    boolean var23 = var0.moveCar((-1), (-1), 10);
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar((-1), (-1), (-1));
    boolean var29 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test132");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar(0, 0, 0);
    boolean var9 = var0.redCarAtExit();
    boolean var13 = var0.moveCar((-1), 1, 10);
    boolean var17 = var0.moveCar(0, 100, 100);
    boolean var21 = var0.moveCar(0, (-1), (-1));
    boolean var25 = var0.moveCar(0, 10, 10);
    boolean var29 = var0.moveCar(10, 100, (-1));
    boolean var33 = var0.moveCar(100, 100, (-1));
    boolean var34 = var0.redCarAtExit();
    boolean var35 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test133");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 10, (-1));
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(1, 0, 0);
    boolean var19 = var0.moveCar(1, (-1), 1);
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar((-1), (-1), 0);
    boolean var28 = var0.moveCar((-1), 0, (-1));
    boolean var29 = var0.redCarAtExit();
    boolean var30 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test134");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var14 = var0.moveCar(1, 100, 1);
    boolean var18 = var0.moveCar(10, 0, 10);
    boolean var22 = var0.moveCar(100, (-1), 1);
    boolean var26 = var0.moveCar(1, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test135");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(1, 1, (-1));
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(100, 100, 10);
    boolean var21 = var0.redCarAtExit();
    boolean var25 = var0.moveCar((-1), 0, 1);
    boolean var29 = var0.moveCar(1, 1, 1);
    boolean var33 = var0.moveCar(1, (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test136");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var14 = var0.moveCar(1, 100, 1);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar((-1), 10, 1);
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(10, 100, 10);
    boolean var25 = var0.redCarAtExit();
    boolean var29 = var0.moveCar((-1), 100, 10);
    boolean var33 = var0.moveCar((-1), 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test137");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(10, (-1), 1);
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(10, 10, 0);
    boolean var19 = var0.moveCar(1, 10, 0);
    boolean var23 = var0.moveCar(100, 0, 1);
    boolean var27 = var0.moveCar(10, (-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test138");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var11 = var0.moveCar(0, 10, (-1));
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar((-1), (-1), 0);
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(10, (-1), 10);
    boolean var22 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test139");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var13 = var0.moveCar(10, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test140");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar(0, 0, 100);
    boolean var9 = var0.redCarAtExit();
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar(0, (-1), 1);
    boolean var18 = var0.moveCar((-1), 0, 0);
    boolean var22 = var0.moveCar(0, (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test141");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var13 = var0.moveCar(0, (-1), 0);
    boolean var17 = var0.moveCar(0, (-1), 0);
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    boolean var20 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test142");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar((-1), 1, 100);
    boolean var18 = var0.moveCar(0, 1, 1);
    boolean var22 = var0.moveCar(10, (-1), (-1));
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(1, 1, 1);
    boolean var31 = var0.moveCar((-1), 100, 10);
    boolean var32 = var0.redCarAtExit();
    boolean var36 = var0.moveCar(1, (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test143");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(100, 10, 1);
    boolean var18 = var0.moveCar(0, 0, 0);
    boolean var22 = var0.moveCar(100, (-1), 10);
    boolean var23 = var0.redCarAtExit();
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar((-1), 10, 10);
    boolean var32 = var0.moveCar(10, 100, 100);
    boolean var33 = var0.redCarAtExit();
    boolean var34 = var0.redCarAtExit();
    boolean var35 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test144");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 0, 1);
    boolean var10 = var0.moveCar(10, 1, 1);
    boolean var14 = var0.moveCar(100, 0, 1);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(1, (-1), 1);
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(1, 0, 100);
    boolean var25 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test145");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var7 = var0.redCarAtExit();
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(1, 1, 100);
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(1, 1, (-1));
    boolean var18 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test146");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var14 = var0.moveCar(1, 100, 1);
    boolean var18 = var0.moveCar(10, 0, 10);
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(10, 100, 1);
    boolean var27 = var0.moveCar(100, 1, 100);
    boolean var31 = var0.moveCar(1, (-1), 100);
    boolean var35 = var0.moveCar(100, 0, 1);
    boolean var39 = var0.moveCar(100, 1, 100);
    boolean var40 = var0.redCarAtExit();
    boolean var44 = var0.moveCar((-1), 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test147");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(10, 1, 1);
    boolean var15 = var0.moveCar(100, 0, (-1));
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar((-1), (-1), 10);
    boolean var21 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test148");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(10, 1, 0);
    boolean var18 = var0.moveCar(100, 1, 1);
    boolean var22 = var0.moveCar(0, 0, (-1));
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar((-1), 0, 0);
    boolean var31 = var0.moveCar(10, 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test149");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, (-1), 100);
    boolean var13 = var0.moveCar((-1), 10, 0);
    boolean var17 = var0.moveCar(1, 100, 1);
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(1, 10, (-1));
    boolean var27 = var0.moveCar(0, 100, 0);
    boolean var28 = var0.redCarAtExit();
    boolean var29 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test150");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(10, 0, 0);
    boolean var14 = var0.moveCar((-1), 10, 1);
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test151");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var14 = var0.moveCar(1, 100, 1);
    boolean var18 = var0.moveCar(10, 0, 10);
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar((-1), (-1), 100);
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar((-1), 10, 10);
    boolean var32 = var0.moveCar(10, 1, 10);
    boolean var33 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test152");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(10, 1, 0);
    boolean var18 = var0.moveCar((-1), 0, 10);
    boolean var22 = var0.moveCar(10, 100, 10);
    boolean var26 = var0.moveCar((-1), 1, 1);
    boolean var27 = var0.redCarAtExit();
    boolean var28 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test153");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 10, (-1));
    boolean var14 = var0.moveCar(0, 100, 10);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(1, 0, 1);
    boolean var23 = var0.moveCar(1, (-1), 1);
    boolean var27 = var0.moveCar((-1), 100, 10);
    boolean var28 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test154");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar(100, 10, 0);
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(1, 0, 10);
    boolean var25 = var0.moveCar(1, 1, (-1));
    boolean var29 = var0.moveCar(10, (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test155");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar(10, 1, 10);
    boolean var18 = var0.moveCar(10, 10, 0);
    boolean var22 = var0.moveCar(100, 100, 10);
    boolean var26 = var0.moveCar(10, 10, 0);
    boolean var30 = var0.moveCar(0, 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test156");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(10, 1, 0);
    boolean var18 = var0.moveCar(10, (-1), (-1));
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(10, 100, 1);
    boolean var27 = var0.moveCar((-1), 0, 10);
    boolean var31 = var0.moveCar(100, (-1), 0);
    boolean var32 = var0.redCarAtExit();
    boolean var33 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test157");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var7 = var0.redCarAtExit();
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar((-1), 0, 10);
    boolean var16 = var0.moveCar(100, 100, 100);
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar((-1), 1, (-1));
    boolean var23 = var0.redCarAtExit();
    boolean var24 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test158");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(100, 10, 1);
    boolean var13 = var0.moveCar(0, 100, (-1));
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(0, (-1), 10);
    boolean var22 = var0.redCarAtExit();
    boolean var23 = var0.redCarAtExit();
    boolean var24 = var0.redCarAtExit();
    boolean var25 = var0.redCarAtExit();
    boolean var26 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test159");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 0, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var13 = var0.moveCar(100, 1, 100);
    boolean var17 = var0.moveCar(1, 0, 100);
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(100, 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test160");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var7 = var0.redCarAtExit();
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(1, 1, 100);
    boolean var16 = var0.moveCar(0, 10, 100);
    boolean var20 = var0.moveCar(0, 1, 10);
    boolean var24 = var0.moveCar(0, 10, 10);
    boolean var28 = var0.moveCar(10, 1, (-1));
    boolean var29 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test161");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 10, 0);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var13 = var0.moveCar(0, (-1), 100);
    boolean var17 = var0.moveCar(100, 10, 100);
    boolean var21 = var0.moveCar(10, 0, (-1));
    boolean var22 = var0.redCarAtExit();
    boolean var23 = var0.redCarAtExit();
    boolean var24 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test162");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar(100, 10, 0);
    boolean var18 = var0.moveCar(10, (-1), 0);
    boolean var19 = var0.redCarAtExit();
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar((-1), 10, (-1));
    boolean var28 = var0.moveCar(1, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test163");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, (-1), 100);
    boolean var13 = var0.moveCar((-1), 10, 0);
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(10, 100, (-1));
    boolean var23 = var0.moveCar(0, 100, 10);
    boolean var27 = var0.moveCar((-1), 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test164");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar(100, 10, 0);
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(100, 10, 100);
    boolean var21 = var0.redCarAtExit();
    boolean var25 = var0.moveCar(1, 0, 10);
    boolean var26 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test165");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(10, 0, 0);
    boolean var14 = var0.moveCar(10, 100, 1);
    boolean var18 = var0.moveCar(100, (-1), 0);
    boolean var19 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test166");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var13 = var0.moveCar(1, 10, 10);
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar(10, 100, 0);
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(1, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test167");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var7 = var0.redCarAtExit();
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(1, 1, 100);
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(10, 0, 0);
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(1, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test168");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(10, 0, 0);
    boolean var14 = var0.moveCar((-1), 1, 10);
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(10, (-1), (-1));
    boolean var22 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test169");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar(10, 1, 10);
    boolean var18 = var0.moveCar(10, 10, 0);
    boolean var22 = var0.moveCar(10, 0, 10);
    boolean var26 = var0.moveCar((-1), 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test170");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var16 = var0.moveCar(10, 10, 1);
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(1, 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test171");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(0, 0, 1);
    boolean var13 = var0.redCarAtExit();
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar(1, 0, 100);
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(1, 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test172");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, 0, 0);
    boolean var13 = var0.moveCar((-1), 10, 1);
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar((-1), 1, 0);
    boolean var19 = var0.redCarAtExit();
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(0, 1, 1);
    boolean var28 = var0.moveCar(1, 0, 100);
    boolean var29 = var0.redCarAtExit();
    boolean var33 = var0.moveCar(1, 10, (-1));
    boolean var34 = var0.redCarAtExit();
    boolean var35 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test173");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(1, 100, 100);
    boolean var13 = var0.moveCar(1, (-1), 100);
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar((-1), 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test174");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar((-1), 100, (-1));
    boolean var5 = var0.redCarAtExit();
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, 1, 10);
    boolean var13 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test175");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(10, 1, 10);
    boolean var9 = var0.moveCar((-1), (-1), 10);
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar(0, 1, 10);
    boolean var15 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test176");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var11 = var0.moveCar((-1), 0, 100);
    boolean var15 = var0.moveCar(1, 100, 100);
    boolean var19 = var0.moveCar((-1), 10, (-1));
    boolean var23 = var0.moveCar(10, (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test177");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar((-1), 10, (-1));
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test178");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 0);
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(0, 0, (-1));
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar(100, 100, 1);
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test179");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var13 = var0.moveCar(1, 10, 10);
    boolean var17 = var0.moveCar(0, (-1), 0);
    boolean var21 = var0.moveCar(100, 0, 0);
    boolean var25 = var0.moveCar(1, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test180");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 10, 100);
    boolean var14 = var0.moveCar(10, 100, 1);
    boolean var18 = var0.moveCar((-1), 100, 1);
    boolean var22 = var0.moveCar((-1), 10, 0);
    boolean var23 = var0.redCarAtExit();
    boolean var24 = var0.redCarAtExit();
    boolean var25 = var0.redCarAtExit();
    boolean var26 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test181");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar((-1), 0, (-1));
    boolean var15 = var0.moveCar(100, 1, 0);
    boolean var19 = var0.moveCar(1, 1, 10);
    boolean var20 = var0.redCarAtExit();
    boolean var21 = var0.redCarAtExit();
    boolean var22 = var0.redCarAtExit();
    boolean var26 = var0.moveCar(10, 0, 1);
    boolean var27 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test182");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 0);
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(100, 10, 10);
    boolean var15 = var0.moveCar(10, 100, 0);
    boolean var19 = var0.moveCar(1, 0, 10);
    boolean var23 = var0.moveCar(0, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test183");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(100, 10, 1);
    boolean var18 = var0.moveCar(0, 0, 0);
    boolean var22 = var0.moveCar(100, (-1), 10);
    boolean var26 = var0.moveCar(10, 0, 1);
    boolean var30 = var0.moveCar(0, 0, 10);
    boolean var31 = var0.redCarAtExit();
    boolean var32 = var0.redCarAtExit();
    boolean var36 = var0.moveCar((-1), (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test184");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var16 = var0.moveCar((-1), (-1), 0);
    boolean var20 = var0.moveCar(10, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test185");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar((-1), 0, 100);
    boolean var12 = var0.moveCar(10, 10, 1);
    boolean var16 = var0.moveCar(1, 100, 10);
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar((-1), (-1), 0);
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar((-1), 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test186");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, (-1), 100);
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar((-1), 10, 0);
    boolean var18 = var0.moveCar(100, 10, 0);
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(1, 100, 0);
    boolean var27 = var0.moveCar((-1), 0, (-1));
    boolean var28 = var0.redCarAtExit();
    boolean var29 = var0.redCarAtExit();
    boolean var30 = var0.redCarAtExit();
    boolean var34 = var0.moveCar(1, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test187");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var16 = var0.moveCar((-1), (-1), 0);
    boolean var20 = var0.moveCar((-1), 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test188");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 10, 0);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(0, (-1), 100);
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test189");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 0, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar((-1), 1, (-1));
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(0, 0, 100);
    boolean var26 = var0.moveCar(10, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test190");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(1, 100, 10);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(0, 10, 0);
    boolean var20 = var0.redCarAtExit();
    boolean var21 = var0.redCarAtExit();
    boolean var22 = var0.redCarAtExit();
    boolean var23 = var0.redCarAtExit();
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar(100, 100, 0);
    boolean var32 = var0.moveCar(1, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test191");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var16 = var0.moveCar(0, 0, (-1));
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(1, 1, 0);
    boolean var26 = var0.moveCar(1, 10, 10);
    boolean var30 = var0.moveCar(0, 100, 1);
    boolean var31 = var0.redCarAtExit();
    boolean var32 = var0.redCarAtExit();
    boolean var36 = var0.moveCar(1, (-1), 10);
    boolean var40 = var0.moveCar((-1), 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test192");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var16 = var0.moveCar(0, 0, (-1));
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(0, 100, 10);
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(100, 100, (-1));
    boolean var31 = var0.moveCar((-1), 10, 1);
    boolean var32 = var0.redCarAtExit();
    boolean var36 = var0.moveCar(1, 0, 0);
    boolean var40 = var0.moveCar(100, (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test193");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(10, 1, 10);
    boolean var9 = var0.moveCar((-1), (-1), 10);
    boolean var13 = var0.moveCar(1, 1, 1);
    boolean var17 = var0.moveCar(0, 1, 1);
    boolean var21 = var0.moveCar(100, (-1), 0);
    boolean var22 = var0.redCarAtExit();
    boolean var26 = var0.moveCar(100, 1, 10);
    boolean var30 = var0.moveCar(1, (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test194");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(100, 1, 0);
    boolean var21 = var0.moveCar(0, 1, 10);
    boolean var25 = var0.moveCar(10, 100, 0);
    boolean var29 = var0.moveCar((-1), 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test195");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(10, 1, 0);
    boolean var18 = var0.moveCar(100, 1, 1);
    boolean var22 = var0.moveCar(0, 0, (-1));
    boolean var26 = var0.moveCar(1, (-1), 0);
    boolean var30 = var0.moveCar(100, 10, (-1));
    boolean var34 = var0.moveCar(100, 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test196");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, (-1), 100);
    boolean var13 = var0.moveCar((-1), 10, 0);
    boolean var17 = var0.moveCar(1, 100, 1);
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(1, 10, (-1));
    boolean var27 = var0.moveCar(100, 100, 10);
    boolean var28 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test197");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(100, 10, 1);
    boolean var13 = var0.moveCar(0, 100, (-1));
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(0, (-1), (-1));
    boolean var25 = var0.moveCar(0, 0, 10);
    boolean var29 = var0.moveCar(0, 100, 10);
    boolean var33 = var0.moveCar(100, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test198");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var13 = var0.redCarAtExit();
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar((-1), 100, 0);
    boolean var22 = var0.moveCar(0, 1, (-1));
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar((-1), (-1), 10);
    boolean var31 = var0.moveCar(0, 10, 100);
    boolean var32 = var0.redCarAtExit();
    boolean var36 = var0.moveCar(1, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test199");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar((-1), 100, (-1));
    boolean var5 = var0.redCarAtExit();
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(1, 1, 100);
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(1, 1, (-1));
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar((-1), 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test200");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var16 = var0.moveCar(10, 10, 1);
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(100, 1, 100);
    boolean var25 = var0.moveCar(100, 100, 100);
    boolean var29 = var0.moveCar(0, 0, 100);
    boolean var33 = var0.moveCar(100, 0, 1);
    boolean var37 = var0.moveCar(100, 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test201");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar((-1), 100, (-1));
    boolean var5 = var0.redCarAtExit();
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(1, 1, 100);
    boolean var15 = var0.moveCar(100, 0, 0);
    boolean var19 = var0.moveCar(0, 100, 100);
    boolean var23 = var0.moveCar(1, 0, 10);
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar(1, 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test202");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar((-1), 1, 100);
    boolean var18 = var0.moveCar(0, 1, 1);
    boolean var22 = var0.moveCar(100, 100, 1);
    boolean var26 = var0.moveCar(0, 100, 100);
    boolean var27 = var0.redCarAtExit();
    boolean var31 = var0.moveCar(100, 10, 0);
    boolean var32 = var0.redCarAtExit();
    boolean var36 = var0.moveCar(1, 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test203");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar((-1), 0, 100);
    boolean var9 = var0.redCarAtExit();
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(1, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test204");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(10, 1, 0);
    boolean var18 = var0.moveCar(10, (-1), (-1));
    boolean var22 = var0.moveCar(1, 10, 100);
    boolean var26 = var0.moveCar(10, 100, 100);
    boolean var30 = var0.moveCar(10, 0, (-1));
    boolean var31 = var0.redCarAtExit();
    boolean var35 = var0.moveCar(1, 100, (-1));
    boolean var39 = var0.moveCar(10, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test205");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, 0, 0);
    boolean var13 = var0.moveCar((-1), 10, 1);
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar((-1), 1, 0);
    boolean var19 = var0.redCarAtExit();
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(0, 1, 1);
    boolean var28 = var0.moveCar(1, 0, 100);
    boolean var29 = var0.redCarAtExit();
    boolean var30 = var0.redCarAtExit();
    boolean var34 = var0.moveCar(0, 100, 0);
    boolean var35 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test206");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar((-1), 0, 100);
    boolean var12 = var0.moveCar(0, (-1), 100);
    boolean var16 = var0.moveCar(1, 10, 100);
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(0, (-1), 0);
    boolean var25 = var0.moveCar(10, 0, 0);
    boolean var29 = var0.moveCar((-1), (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test207");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(10, 1, 0);
    boolean var18 = var0.moveCar(1, 100, 10);
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(0, 1, 10);
    boolean var24 = var0.redCarAtExit();
    boolean var25 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test208");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(1, 100, 100);
    boolean var13 = var0.moveCar(1, 10, (-1));
    boolean var17 = var0.moveCar(1, 100, 0);
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(10, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test209");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(10, 1, 10);
    boolean var9 = var0.moveCar((-1), (-1), 10);
    boolean var13 = var0.moveCar(1, 100, 1);
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar(100, 1, 100);
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(0, 0, 0);
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar(100, 0, 1);
    boolean var29 = var0.redCarAtExit();
    boolean var33 = var0.moveCar(100, 0, 1);
    boolean var34 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test210");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar((-1), 0, (-1));
    boolean var15 = var0.moveCar(100, 1, 0);
    boolean var19 = var0.moveCar(1, (-1), 0);
    boolean var23 = var0.moveCar(100, 10, 0);
    boolean var27 = var0.moveCar((-1), (-1), (-1));
    boolean var28 = var0.redCarAtExit();
    boolean var32 = var0.moveCar(0, 10, 0);
    boolean var36 = var0.moveCar(100, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test211");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(10, 1, 0);
    boolean var18 = var0.moveCar(1, 100, 10);
    boolean var19 = var0.redCarAtExit();
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar((-1), 10, 1);
    boolean var28 = var0.moveCar(100, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test212");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var16 = var0.moveCar(0, 0, (-1));
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(0, 100, 10);
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(100, 100, (-1));
    boolean var31 = var0.moveCar((-1), 10, 1);
    boolean var35 = var0.moveCar(10, 100, (-1));
    boolean var39 = var0.moveCar(100, 100, 100);
    boolean var40 = var0.redCarAtExit();
    boolean var44 = var0.moveCar(0, 0, 0);
    boolean var45 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test213");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 10, (-1));
    boolean var14 = var0.moveCar((-1), 0, 100);
    boolean var18 = var0.moveCar(100, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test214");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(100, 10, 1);
    boolean var18 = var0.moveCar(0, 0, 0);
    boolean var22 = var0.moveCar((-1), 100, 100);
    boolean var26 = var0.moveCar(10, (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test215");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar(0, 0, 0);
    boolean var9 = var0.redCarAtExit();
    boolean var13 = var0.moveCar((-1), 1, 10);
    boolean var17 = var0.moveCar(0, 100, 100);
    boolean var21 = var0.moveCar(1, 1, 0);
    boolean var22 = var0.redCarAtExit();
    boolean var23 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test216");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(0, 1, 10);
    boolean var14 = var0.moveCar(10, 0, 100);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(10, 0, 1);
    boolean var23 = var0.moveCar(100, 10, (-1));
    boolean var27 = var0.moveCar(0, 10, 1);
    boolean var28 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test217");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 10, 0);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var13 = var0.moveCar(1, 100, 10);
    boolean var17 = var0.moveCar(1, (-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test218");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(1, 100, 10);
    boolean var18 = var0.moveCar(100, 10, 1);
    boolean var22 = var0.moveCar(10, 10, 1);
    boolean var26 = var0.moveCar(1, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test219");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar((-1), 0, 100);
    boolean var12 = var0.moveCar(10, 10, 1);
    boolean var16 = var0.moveCar(1, 100, 10);
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar((-1), 0, 1);
    boolean var25 = var0.moveCar(100, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test220");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(1, 100, 10);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(0, 10, 0);
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(100, 10, 10);
    boolean var25 = var0.redCarAtExit();
    boolean var29 = var0.moveCar(100, (-1), 0);
    boolean var33 = var0.moveCar(10, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test221");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 0, 1);
    boolean var10 = var0.moveCar(10, 1, 1);
    boolean var14 = var0.moveCar(100, 0, 1);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(1, (-1), 1);
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(1, 0, 100);
    boolean var28 = var0.moveCar(100, 1, 100);
    boolean var29 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test222");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var13 = var0.moveCar(1, 100, 10);
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar(10, 1, 100);
    boolean var22 = var0.moveCar(10, 1, 1);
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(0, 100, 0);
    boolean var31 = var0.moveCar(1, 10, 10);
    boolean var35 = var0.moveCar(0, 1, 10);
    boolean var39 = var0.moveCar(1, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test223");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 0);
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(0, 0, (-1));
    boolean var15 = var0.moveCar(1, (-1), 1);
    boolean var19 = var0.moveCar(100, 0, 10);
    boolean var23 = var0.moveCar(100, 0, 0);
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar(0, (-1), 100);
    boolean var32 = var0.moveCar(0, 10, 100);
    boolean var33 = var0.redCarAtExit();
    boolean var34 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test224");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(1, 1, (-1));
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(100, 100, 10);
    boolean var21 = var0.redCarAtExit();
    boolean var25 = var0.moveCar((-1), 0, 1);
    boolean var29 = var0.moveCar(1, 1, 1);
    boolean var30 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test225");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var14 = var0.moveCar(1, 100, 1);
    boolean var18 = var0.moveCar(10, 0, 10);
    boolean var19 = var0.redCarAtExit();
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar((-1), (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test226");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar((-1), 0, (-1));
    boolean var15 = var0.moveCar(100, 1, 0);
    boolean var19 = var0.moveCar(1, 1, 10);
    boolean var23 = var0.moveCar((-1), (-1), 100);
    boolean var27 = var0.moveCar(1, 10, (-1));
    boolean var28 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test227");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(0, 1, 100);
    boolean var10 = var0.moveCar((-1), 1, 10);
    boolean var14 = var0.moveCar(10, 100, (-1));
    boolean var18 = var0.moveCar(1, 10, 100);
    boolean var22 = var0.moveCar(0, 1, 0);
    boolean var23 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test228");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 0);
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(100, 10, 10);
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar(100, 1, 0);
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(100, 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test229");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, (-1), 100);
    boolean var13 = var0.moveCar((-1), 10, 0);
    boolean var17 = var0.moveCar(0, 0, 1);
    boolean var21 = var0.moveCar(100, (-1), 100);
    boolean var25 = var0.moveCar(0, 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test230");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(10, 1, 0);
    boolean var18 = var0.moveCar((-1), 0, 10);
    boolean var19 = var0.redCarAtExit();
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar((-1), 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test231");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var13 = var0.redCarAtExit();
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar((-1), 100, 0);
    boolean var22 = var0.moveCar((-1), 10, 100);
    boolean var26 = var0.moveCar(10, (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test232");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, 0, 0);
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar(1, 100, 10);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(1, (-1), 1);
    boolean var23 = var0.moveCar(1, 100, 100);
    boolean var27 = var0.moveCar((-1), 10, (-1));
    boolean var31 = var0.moveCar((-1), 0, 1);
    boolean var32 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test233");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar(0, 0, 100);
    boolean var9 = var0.redCarAtExit();
    boolean var13 = var0.moveCar(1, 100, (-1));
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(1, 1, 0);
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(10, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test234");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar((-1), 1, 1);
    boolean var13 = var0.moveCar(0, 10, 10);
    boolean var17 = var0.moveCar(100, 0, 10);
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(10, (-1), 10);
    boolean var26 = var0.moveCar(10, 1, (-1));
    boolean var27 = var0.redCarAtExit();
    boolean var28 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test235");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var14 = var0.moveCar(1, 100, 1);
    boolean var18 = var0.moveCar(10, 0, 10);
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(10, 100, 1);
    boolean var27 = var0.moveCar(0, 1, (-1));
    boolean var31 = var0.moveCar(10, 100, 1);
    boolean var35 = var0.moveCar(10, 1, 10);
    boolean var36 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test236");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 0);
    boolean var10 = var0.moveCar(1, 0, 100);
    boolean var14 = var0.moveCar((-1), 0, 1);
    boolean var15 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test237");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(1, 100, 100);
    boolean var13 = var0.moveCar(1, (-1), 100);
    boolean var17 = var0.moveCar(0, 100, 1);
    boolean var21 = var0.moveCar(0, 10, 0);
    boolean var25 = var0.moveCar(1, 100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test238");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(10, 0, 0);
    boolean var14 = var0.moveCar((-1), 1, 10);
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(100, 100, 0);
    boolean var22 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test239");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 10, (-1));
    boolean var14 = var0.moveCar(0, 100, 10);
    boolean var18 = var0.moveCar(1, 1, (-1));
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar((-1), (-1), (-1));
    boolean var24 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test240");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var4 = var0.redCarAtExit();
    boolean var5 = var0.redCarAtExit();
    boolean var9 = var0.moveCar(0, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar((-1), 0, (-1));
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(100, 10, 1);
    boolean var21 = var0.redCarAtExit();
    boolean var25 = var0.moveCar(10, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test241");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(10, 1, 10);
    boolean var9 = var0.moveCar((-1), (-1), 100);
    boolean var13 = var0.moveCar(10, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test242");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(10, 1, 0);
    boolean var18 = var0.moveCar(0, 10, 100);
    boolean var19 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test243");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var16 = var0.moveCar(10, 10, 1);
    boolean var20 = var0.moveCar(1, (-1), 0);
    boolean var24 = var0.moveCar(0, 100, (-1));
    boolean var28 = var0.moveCar(100, (-1), 100);
    boolean var32 = var0.moveCar(10, 1, 0);
    boolean var36 = var0.moveCar(0, (-1), 0);
    boolean var40 = var0.moveCar((-1), 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test244");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(1, 1, (-1));
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar((-1), 1, 1);
    boolean var24 = var0.moveCar(100, 0, (-1));
    boolean var28 = var0.moveCar(0, 100, 10);
    boolean var32 = var0.moveCar(100, 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test245");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(1, 1, (-1));
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar((-1), 1, 1);
    boolean var24 = var0.moveCar(100, 0, (-1));
    boolean var25 = var0.redCarAtExit();
    boolean var26 = var0.redCarAtExit();
    boolean var30 = var0.moveCar(1, 0, 0);
    boolean var34 = var0.moveCar(100, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test246");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(100, 100, 1);
    boolean var21 = var0.moveCar(100, 10, 0);
    boolean var22 = var0.redCarAtExit();
    boolean var26 = var0.moveCar(100, (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test247");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var13 = var0.moveCar(1, 100, 10);
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar(10, 1, 100);
    boolean var22 = var0.moveCar(10, 1, 1);
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(10, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test248");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 0, 1);
    boolean var10 = var0.moveCar(10, 1, 1);
    boolean var14 = var0.moveCar(100, 0, 1);
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(1, 0, 0);
    boolean var24 = var0.moveCar(100, 0, 10);
    boolean var28 = var0.moveCar(100, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test249");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var16 = var0.moveCar(10, 10, 1);
    boolean var20 = var0.moveCar(1, (-1), 0);
    boolean var24 = var0.moveCar(0, 100, (-1));
    boolean var28 = var0.moveCar(100, (-1), 100);
    boolean var32 = var0.moveCar(10, 0, 1);
    boolean var33 = var0.redCarAtExit();
    boolean var34 = var0.redCarAtExit();
    boolean var35 = var0.redCarAtExit();
    boolean var39 = var0.moveCar((-1), 100, 10);
    boolean var40 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test250");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar((-1), 1, 100);
    boolean var18 = var0.moveCar(0, 1, 1);
    boolean var22 = var0.moveCar(10, (-1), (-1));
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(1, 1, 1);
    boolean var31 = var0.moveCar((-1), 100, 10);
    boolean var35 = var0.moveCar(0, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test251");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(10, 0, 0);
    boolean var14 = var0.moveCar((-1), 1, 10);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(100, 100, (-1));
    boolean var23 = var0.moveCar(100, 1, 10);
    boolean var27 = var0.moveCar(10, 0, 10);
    boolean var31 = var0.moveCar(100, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test252");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar((-1), 0, (-1));
    boolean var15 = var0.moveCar(100, 1, 0);
    boolean var19 = var0.moveCar(1, 0, 10);
    boolean var23 = var0.moveCar((-1), 10, 1);
    boolean var27 = var0.moveCar((-1), 100, 0);
    boolean var28 = var0.redCarAtExit();
    boolean var32 = var0.moveCar(10, 10, (-1));
    boolean var36 = var0.moveCar(10, 10, 10);
    boolean var37 = var0.redCarAtExit();
    boolean var41 = var0.moveCar((-1), 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test253");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(10, 0, 10);
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar(1, 10, 10);
    boolean var18 = var0.moveCar(10, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test254");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(0, 1, 10);
    boolean var16 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test255");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(0, 0, 1);
    boolean var16 = var0.moveCar(100, (-1), 0);
    boolean var20 = var0.moveCar(0, 0, 100);
    boolean var24 = var0.moveCar(100, 1, 0);
    boolean var28 = var0.moveCar(0, 1, 10);
    boolean var29 = var0.redCarAtExit();
    boolean var33 = var0.moveCar(10, 100, 0);
    boolean var34 = var0.redCarAtExit();
    boolean var38 = var0.moveCar(100, 10, (-1));
    boolean var39 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test256");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var11 = var0.moveCar((-1), 0, 100);
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar((-1), 10, 1);
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar((-1), 100, (-1));
    boolean var23 = var0.redCarAtExit();
    boolean var24 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test257");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(100, 10, 1);
    boolean var13 = var0.moveCar(0, 100, (-1));
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(1, 1, 1);
    boolean var25 = var0.moveCar(10, 10, 100);
    boolean var26 = var0.redCarAtExit();
    boolean var30 = var0.moveCar(1, 0, 10);
    boolean var34 = var0.moveCar(100, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test258");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var13 = var0.moveCar(0, (-1), 0);
    boolean var17 = var0.moveCar(0, (-1), 0);
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(1, 100, 100);
    boolean var26 = var0.moveCar(0, 100, 100);
    boolean var27 = var0.redCarAtExit();
    boolean var28 = var0.redCarAtExit();
    boolean var29 = var0.redCarAtExit();
    boolean var30 = var0.redCarAtExit();
    boolean var34 = var0.moveCar((-1), 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test259");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 0);
    boolean var10 = var0.moveCar(1, 0, 100);
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(10, 100, 10);
    boolean var19 = var0.moveCar(100, 100, 1);
    boolean var20 = var0.redCarAtExit();
    boolean var21 = var0.redCarAtExit();
    boolean var25 = var0.moveCar(1, 1, 10);
    boolean var26 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test260");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, 0, 0);
    boolean var13 = var0.moveCar((-1), 10, 1);
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar((-1), 1, 0);
    boolean var19 = var0.redCarAtExit();
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(0, 1, 1);
    boolean var28 = var0.moveCar(1, 0, 100);
    boolean var32 = var0.moveCar(10, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test261");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar(0, 1, (-1));
    boolean var17 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test262");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 0);
    boolean var10 = var0.moveCar(1, 0, 100);
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(0, 10, (-1));
    boolean var16 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test263");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var14 = var0.moveCar(1, 100, 1);
    boolean var18 = var0.moveCar(10, 0, 10);
    boolean var22 = var0.moveCar(100, 0, 1);
    boolean var23 = var0.redCarAtExit();
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar((-1), 0, 1);
    boolean var32 = var0.moveCar(100, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test264");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 0, (-1));
    boolean var11 = var0.moveCar(10, 10, 0);
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar(10, 1, 1);
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(0, 0, 0);
    boolean var25 = var0.moveCar(10, 1, (-1));
    boolean var29 = var0.moveCar((-1), 0, 0);
    boolean var33 = var0.moveCar(0, (-1), 1);
    boolean var34 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test265");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(100, 10, 1);
    boolean var13 = var0.moveCar(0, 100, (-1));
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(0, (-1), 10);
    boolean var22 = var0.redCarAtExit();
    boolean var23 = var0.redCarAtExit();
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar((-1), 0, (-1));
    boolean var29 = var0.redCarAtExit();
    boolean var33 = var0.moveCar((-1), 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test266");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 0);
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(0, 1, 0);
    boolean var15 = var0.moveCar((-1), 0, 1);
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(10, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test267");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, (-1), 100);
    boolean var13 = var0.moveCar((-1), 10, 0);
    boolean var17 = var0.moveCar(0, 0, 1);
    boolean var21 = var0.moveCar(10, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test268");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar(100, 0, 0);
    boolean var20 = var0.moveCar(1, 10, 10);
    boolean var21 = var0.redCarAtExit();
    boolean var22 = var0.redCarAtExit();
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(100, (-1), 1);
    boolean var28 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test269");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var13 = var0.moveCar(10, 1, 100);
    boolean var17 = var0.moveCar(1, 100, 0);
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(0, 100, 0);
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(100, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test270");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar((-1), 0, 10);
    boolean var21 = var0.moveCar(1, 10, (-1));
    boolean var25 = var0.moveCar(100, (-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test271");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(0, 1, 10);
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(0, 10, (-1));
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(100, (-1), 0);
    boolean var21 = var0.redCarAtExit();
    boolean var25 = var0.moveCar(10, 100, (-1));
    boolean var29 = var0.moveCar(100, 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test272");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 0, 1);
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(100, (-1), (-1));
    boolean var15 = var0.moveCar((-1), 0, 1);
    boolean var19 = var0.moveCar(1, 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test273");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 0);
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(0, 0, (-1));
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar(0, 0, (-1));
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(1, 100, 0);
    boolean var28 = var0.moveCar((-1), 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test274");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar((-1), 0, (-1));
    boolean var15 = var0.moveCar(100, 1, 0);
    boolean var19 = var0.moveCar(1, (-1), 0);
    boolean var23 = var0.moveCar(100, 10, 0);
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar(10, 1, 10);
    boolean var32 = var0.moveCar(1, 100, 10);
    boolean var36 = var0.moveCar(0, 0, (-1));
    boolean var40 = var0.moveCar(0, (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test275");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(10, (-1), 1);
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar(10, 10, (-1));
    boolean var20 = var0.moveCar((-1), (-1), 100);
    boolean var21 = var0.redCarAtExit();
    boolean var25 = var0.moveCar((-1), 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test276");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar((-1), 0, 0);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(10, 0, (-1));
    boolean var23 = var0.moveCar(10, 0, 100);
    boolean var27 = var0.moveCar(0, 0, 1);
    boolean var31 = var0.moveCar(100, (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test277");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(10, 1, 10);
    boolean var9 = var0.moveCar((-1), (-1), 10);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(0, 100, 0);
    boolean var19 = var0.moveCar(10, 0, 1);
    boolean var20 = var0.redCarAtExit();
    boolean var21 = var0.redCarAtExit();
    boolean var25 = var0.moveCar(10, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test278");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(10, 1, 0);
    boolean var18 = var0.moveCar(10, (-1), 0);
    boolean var22 = var0.moveCar((-1), 100, 0);
    boolean var26 = var0.moveCar(10, 10, (-1));
    boolean var30 = var0.moveCar((-1), 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test279");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(10, 1, 10);
    boolean var9 = var0.moveCar((-1), (-1), 10);
    boolean var13 = var0.moveCar(1, 100, 1);
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar(100, 1, 100);
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(0, 0, 0);
    boolean var27 = var0.moveCar(10, (-1), 0);
    boolean var31 = var0.moveCar(10, 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test280");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar((-1), 0, (-1));
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(10, 1, 100);
    boolean var19 = var0.moveCar(100, 1, 100);
    boolean var23 = var0.moveCar((-1), (-1), 100);
    boolean var27 = var0.moveCar(0, 0, 1);
    boolean var31 = var0.moveCar(100, (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test281");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(1, 100, 100);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(100, 1, 1);
    boolean var18 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test282");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar(100, 10, 0);
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(1, 100, 0);
    boolean var25 = var0.moveCar(0, 100, 0);
    boolean var26 = var0.redCarAtExit();
    boolean var30 = var0.moveCar(100, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test283");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar((-1), 0, 100);
    boolean var12 = var0.moveCar(10, 10, 1);
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(100, 100, (-1));
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(100, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test284");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var4 = var0.redCarAtExit();
    boolean var5 = var0.redCarAtExit();
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(100, (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test285");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(100, 1, 0);
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar((-1), 1, 1);
    boolean var28 = var0.moveCar(1, 1, 100);
    boolean var32 = var0.moveCar(100, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test286");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(100, 10, 1);
    boolean var13 = var0.moveCar(0, 100, (-1));
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(0, 10, 0);
    boolean var26 = var0.moveCar(10, 10, 0);
    boolean var30 = var0.moveCar(10, 0, 10);
    boolean var34 = var0.moveCar(0, (-1), 1);
    boolean var38 = var0.moveCar(0, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test287");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar((-1), 1, 100);
    boolean var18 = var0.moveCar(10, (-1), 10);
    boolean var22 = var0.moveCar(0, (-1), 10);
    boolean var23 = var0.redCarAtExit();
    boolean var24 = var0.redCarAtExit();
    boolean var25 = var0.redCarAtExit();
    boolean var29 = var0.moveCar(100, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test288");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var13 = var0.moveCar(1, 100, 10);
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(1, (-1), 100);
    boolean var23 = var0.moveCar(1, 10, 1);
    boolean var27 = var0.moveCar((-1), 1, 100);
    boolean var28 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test289");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(100, 100, (-1));
    boolean var21 = var0.moveCar(1, 0, (-1));
    boolean var22 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test290");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar((-1), 0, (-1));
    boolean var15 = var0.moveCar(100, 1, 0);
    boolean var19 = var0.moveCar(1, 0, 10);
    boolean var23 = var0.moveCar(100, 0, 100);
    boolean var27 = var0.moveCar((-1), (-1), (-1));
    boolean var31 = var0.moveCar(100, 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test291");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(10, 1, 10);
    boolean var9 = var0.moveCar((-1), (-1), 10);
    boolean var13 = var0.moveCar(1, 0, (-1));
    boolean var17 = var0.moveCar(100, 10, 1);
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar((-1), 100, 0);
    boolean var23 = var0.redCarAtExit();
    boolean var24 = var0.redCarAtExit();
    boolean var25 = var0.redCarAtExit();
    boolean var26 = var0.redCarAtExit();
    boolean var30 = var0.moveCar(0, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test292");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(100, 0, (-1));
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(100, (-1), 100);
    boolean var25 = var0.moveCar(1, 10, 100);
    boolean var26 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test293");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(1, 1, (-1));
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar((-1), 10, 100);
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(10, 100, 0);
    boolean var28 = var0.moveCar(100, 1, 10);
    boolean var32 = var0.moveCar(0, 1, 100);
    boolean var36 = var0.moveCar(1, 0, 10);
    boolean var40 = var0.moveCar(0, 1, 1);
    boolean var41 = var0.redCarAtExit();
    boolean var45 = var0.moveCar(100, (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test294");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 10, (-1));
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(1, 0, 0);
    boolean var19 = var0.moveCar(1, (-1), 1);
    boolean var23 = var0.moveCar(0, 0, (-1));
    boolean var24 = var0.redCarAtExit();
    boolean var25 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test295");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar((-1), 1, 100);
    boolean var18 = var0.moveCar(10, (-1), 10);
    boolean var22 = var0.moveCar(0, (-1), 10);
    boolean var26 = var0.moveCar(0, 100, (-1));
    boolean var30 = var0.moveCar(0, 10, 100);
    boolean var31 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test296");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var5 = var0.redCarAtExit();
    boolean var9 = var0.moveCar((-1), 10, 10);
    boolean var13 = var0.moveCar(1, 1, (-1));
    boolean var14 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test297");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(1, 1, (-1));
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(10, 1, (-1));
    boolean var24 = var0.moveCar(10, 100, 100);
    boolean var25 = var0.redCarAtExit();
    boolean var26 = var0.redCarAtExit();
    boolean var30 = var0.moveCar(0, 0, (-1));
    boolean var34 = var0.moveCar(100, 100, 100);
    boolean var38 = var0.moveCar((-1), 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test298");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar((-1), 1, 1);
    boolean var19 = var0.moveCar(100, 100, 10);
    boolean var23 = var0.moveCar((-1), 0, 10);
    boolean var27 = var0.moveCar(1, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test299");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar(10, 1, 10);
    boolean var18 = var0.moveCar(10, 10, 0);
    boolean var22 = var0.moveCar(100, 100, 10);
    boolean var26 = var0.moveCar(10, 10, 0);
    boolean var27 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test300");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(0, 1, 10);
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(0, 10, (-1));
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(100, (-1), 0);
    boolean var21 = var0.redCarAtExit();
    boolean var25 = var0.moveCar(10, 1, 10);
    boolean var26 = var0.redCarAtExit();
    boolean var30 = var0.moveCar(10, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test301");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 0, 10);
    boolean var11 = var0.moveCar(1, (-1), 100);
    boolean var15 = var0.moveCar(100, 0, 1);
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(100, 10, 10);
    boolean var24 = var0.moveCar(10, (-1), (-1));
    boolean var25 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test302");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(0, 1, 10);
    boolean var14 = var0.moveCar(0, (-1), 10);
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test303");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(1, 1, (-1));
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(10, 1, (-1));
    boolean var24 = var0.moveCar(10, (-1), 1);
    boolean var28 = var0.moveCar(100, 1, (-1));
    boolean var32 = var0.moveCar((-1), 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test304");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 0);
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(0, 0, (-1));
    boolean var15 = var0.moveCar(1, (-1), 1);
    boolean var19 = var0.moveCar(100, 1, 100);
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(0, 100, 1);
    boolean var25 = var0.redCarAtExit();
    boolean var29 = var0.moveCar(1, 100, (-1));
    boolean var33 = var0.moveCar((-1), (-1), 10);
    boolean var37 = var0.moveCar(100, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test305");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar((-1), 0, (-1));
    boolean var15 = var0.moveCar(100, 1, 0);
    boolean var19 = var0.moveCar(1, (-1), 0);
    boolean var20 = var0.redCarAtExit();
    boolean var21 = var0.redCarAtExit();
    boolean var25 = var0.moveCar(100, 10, 0);
    boolean var29 = var0.moveCar((-1), 10, 100);
    boolean var33 = var0.moveCar((-1), 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test306");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 0);
    boolean var10 = var0.moveCar(1, 0, 100);
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(0, 10, 100);
    boolean var19 = var0.moveCar(10, (-1), 0);
    boolean var20 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test307");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(100, 10, 1);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(10, 1, 1);
    boolean var19 = var0.moveCar(0, 100, (-1));
    boolean var23 = var0.moveCar(1, 1, (-1));
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar(100, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test308");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(100, 0, (-1));
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(10, 0, (-1));
    boolean var23 = var0.redCarAtExit();
    boolean var24 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test309");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(10, (-1), 1);
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(10, 10, 0);
    boolean var19 = var0.moveCar(1, 10, 0);
    boolean var23 = var0.moveCar(100, 0, 1);
    boolean var27 = var0.moveCar(100, (-1), 10);
    boolean var31 = var0.moveCar((-1), 100, 0);
    boolean var32 = var0.redCarAtExit();
    boolean var36 = var0.moveCar(100, (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test310");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar((-1), 0, 100);
    boolean var12 = var0.moveCar(0, (-1), 100);
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(0, 0, 0);
    boolean var21 = var0.moveCar(1, 0, 100);
    boolean var25 = var0.moveCar(1, 10, 1);
    boolean var29 = var0.moveCar((-1), 1, 0);
    boolean var30 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test311");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, (-1), 100);
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar((-1), (-1), (-1));
    boolean var18 = var0.moveCar(100, 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test312");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var11 = var0.moveCar((-1), 0, 100);
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar((-1), (-1), 0);
    boolean var20 = var0.moveCar(10, (-1), 10);
    boolean var24 = var0.moveCar(1, 10, 10);
    boolean var25 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test313");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar((-1), 100, (-1));
    boolean var5 = var0.redCarAtExit();
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(1, 1, 100);
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar((-1), 100, 0);
    boolean var21 = var0.moveCar(10, 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test314");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(100, 100, 10);
    boolean var18 = var0.moveCar(100, 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test315");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar((-1), 0, 100);
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(0, 0, 100);
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(1, 100, 10);
    boolean var26 = var0.moveCar(1, 100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test316");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(10, 1, 1);
    boolean var15 = var0.moveCar((-1), 10, 10);
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar((-1), 10, 100);
    boolean var21 = var0.redCarAtExit();
    boolean var25 = var0.moveCar(10, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test317");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(10, 1, 1);
    boolean var15 = var0.moveCar((-1), 1, 10);
    boolean var19 = var0.moveCar(1, 1, 100);
    boolean var20 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test318");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(100, 10, 1);
    boolean var13 = var0.moveCar(0, 100, (-1));
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(0, (-1), 10);
    boolean var25 = var0.moveCar((-1), 1, 0);
    boolean var29 = var0.moveCar(10, 100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test319");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 10, 100);
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar(10, 100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test320");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar((-1), 0, 100);
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(0, 0, 100);
    boolean var19 = var0.moveCar(1, 10, 10);
    boolean var23 = var0.moveCar(10, (-1), 10);
    boolean var27 = var0.moveCar(1, 1, 0);
    boolean var28 = var0.redCarAtExit();
    boolean var32 = var0.moveCar(100, 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test321");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(1, 1, (-1));
    boolean var18 = var0.moveCar(100, 10, 10);
    boolean var22 = var0.moveCar(100, 1, 0);
    boolean var26 = var0.moveCar(10, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test322");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 0, 10);
    boolean var11 = var0.moveCar(100, 0, 100);
    boolean var15 = var0.moveCar(1, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test323");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(100, 10, 1);
    boolean var18 = var0.moveCar(0, 0, 0);
    boolean var22 = var0.moveCar(100, (-1), 10);
    boolean var26 = var0.moveCar(10, 0, 1);
    boolean var27 = var0.redCarAtExit();
    boolean var31 = var0.moveCar(1, 10, 1);
    boolean var32 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test324");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar((-1), 0, (-1));
    boolean var15 = var0.moveCar(100, 1, 0);
    boolean var19 = var0.moveCar(1, 0, 10);
    boolean var23 = var0.moveCar((-1), 10, 1);
    boolean var27 = var0.moveCar((-1), 100, 0);
    boolean var28 = var0.redCarAtExit();
    boolean var29 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test325");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(10, 1, 10);
    boolean var9 = var0.moveCar((-1), (-1), 10);
    boolean var13 = var0.moveCar(1, 100, 1);
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar(100, 1, 100);
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(0, 0, 0);
    boolean var27 = var0.moveCar(10, (-1), 0);
    boolean var28 = var0.redCarAtExit();
    boolean var29 = var0.redCarAtExit();
    boolean var33 = var0.moveCar(100, 0, 0);
    boolean var37 = var0.moveCar(0, 0, 1);
    boolean var41 = var0.moveCar(10, 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test326");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(0, (-1), (-1));
    boolean var14 = var0.moveCar((-1), 100, 10);
    boolean var18 = var0.moveCar(1, (-1), 10);
    boolean var22 = var0.moveCar((-1), 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test327");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var5 = var0.redCarAtExit();
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(0, 100, 100);
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar((-1), 0, 0);
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test328");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 0);
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(0, 0, (-1));
    boolean var15 = var0.moveCar(1, (-1), 1);
    boolean var19 = var0.moveCar(100, 1, 100);
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(0, 100, 1);
    boolean var28 = var0.moveCar(0, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test329");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(1, 100, 10);
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar((-1), 0, 10);
    boolean var21 = var0.redCarAtExit();
    boolean var25 = var0.moveCar(10, (-1), 1);
    boolean var29 = var0.moveCar(100, (-1), 10);
    boolean var33 = var0.moveCar(10, 1, (-1));
    boolean var37 = var0.moveCar(0, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test330");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var7 = var0.redCarAtExit();
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(1, 1, 100);
    boolean var16 = var0.moveCar(0, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test331");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(10, 1, 10);
    boolean var9 = var0.moveCar((-1), (-1), 10);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(0, 100, 0);
    boolean var19 = var0.moveCar(10, 0, 1);
    boolean var23 = var0.moveCar(100, 1, 1);
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar((-1), 10, 0);
    boolean var29 = var0.redCarAtExit();
    boolean var30 = var0.redCarAtExit();
    boolean var31 = var0.redCarAtExit();
    boolean var32 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test332");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var11 = var0.moveCar((-1), 0, 100);
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar((-1), 10, 1);
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(1, 1, (-1));
    boolean var26 = var0.moveCar(0, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test333");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(100, 10, 1);
    boolean var13 = var0.moveCar(0, 100, (-1));
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(0, (-1), 10);
    boolean var25 = var0.moveCar((-1), 1, 0);
    boolean var26 = var0.redCarAtExit();
    boolean var27 = var0.redCarAtExit();
    boolean var28 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test334");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(1, 1, (-1));
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(100, 100, 10);
    boolean var21 = var0.redCarAtExit();
    boolean var25 = var0.moveCar((-1), 0, 1);
    boolean var29 = var0.moveCar(10, 100, 10);
    boolean var30 = var0.redCarAtExit();
    boolean var31 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test335");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(10, 1, 1);
    boolean var15 = var0.moveCar(100, 0, (-1));
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(10, (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test336");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar(100, 10, 0);
    boolean var18 = var0.moveCar(1, 0, 100);
    boolean var22 = var0.moveCar(100, 1, 0);
    boolean var26 = var0.moveCar((-1), (-1), 1);
    boolean var27 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test337");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar((-1), 0, (-1));
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(10, 1, 100);
    boolean var19 = var0.moveCar(100, 1, 100);
    boolean var23 = var0.moveCar((-1), (-1), 100);
    boolean var27 = var0.moveCar(0, 0, 1);
    boolean var31 = var0.moveCar(0, 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test338");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(100, 10, 1);
    boolean var18 = var0.moveCar(0, 0, 0);
    boolean var22 = var0.moveCar(100, (-1), 10);
    boolean var26 = var0.moveCar(10, 0, 1);
    boolean var30 = var0.moveCar(0, 0, 10);
    boolean var31 = var0.redCarAtExit();
    boolean var35 = var0.moveCar(100, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test339");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(10, 1, 0);
    boolean var18 = var0.moveCar(100, 1, 1);
    boolean var19 = var0.redCarAtExit();
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar((-1), 10, 10);
    boolean var28 = var0.moveCar(0, 0, 10);
    boolean var32 = var0.moveCar(1, 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test340");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar(0, 0, 0);
    boolean var9 = var0.redCarAtExit();
    boolean var13 = var0.moveCar((-1), 1, 10);
    boolean var17 = var0.moveCar(0, 100, 100);
    boolean var21 = var0.moveCar((-1), 10, (-1));
    boolean var22 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test341");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var14 = var0.moveCar(1, 100, 1);
    boolean var18 = var0.moveCar(0, 100, 1);
    boolean var22 = var0.moveCar((-1), 100, (-1));
    boolean var26 = var0.moveCar(100, (-1), (-1));
    boolean var30 = var0.moveCar(10, 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test342");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 10, 0);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var13 = var0.moveCar(0, (-1), 100);
    boolean var17 = var0.moveCar(100, 10, 100);
    boolean var21 = var0.moveCar(10, 0, (-1));
    boolean var25 = var0.moveCar(1, 0, 100);
    boolean var29 = var0.moveCar(10, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test343");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(100, 10, 1);
    boolean var18 = var0.moveCar(0, 0, 0);
    boolean var22 = var0.moveCar(100, (-1), 10);
    boolean var26 = var0.moveCar(0, (-1), (-1));
    boolean var27 = var0.redCarAtExit();
    boolean var31 = var0.moveCar(0, 100, 10);
    boolean var35 = var0.moveCar(1, 1, 100);
    boolean var39 = var0.moveCar(100, 1, (-1));
    boolean var43 = var0.moveCar(100, 0, 100);
    boolean var47 = var0.moveCar(1, 0, 1);
    boolean var51 = var0.moveCar(0, (-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test344");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 10, (-1));
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar(10, 0, 10);
    boolean var20 = var0.moveCar(1, (-1), 1);
    boolean var24 = var0.moveCar(1, 10, 0);
    boolean var28 = var0.moveCar(10, 1, 0);
    boolean var29 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test345");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(100, 0, 10);
    boolean var5 = var0.redCarAtExit();
    boolean var9 = var0.moveCar(10, 10, 10);
    boolean var13 = var0.moveCar((-1), 1, 0);
    boolean var17 = var0.moveCar(0, (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test346");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 10, (-1));
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar((-1), 10, 1);
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar((-1), 1, 1);
    boolean var24 = var0.moveCar(100, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test347");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var11 = var0.moveCar((-1), 0, 100);
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar((-1), 10, 1);
    boolean var21 = var0.moveCar(0, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test348");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(0, 1, 10);
    boolean var14 = var0.moveCar(10, 0, 100);
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(0, 1, 1);
    boolean var24 = var0.moveCar((-1), 100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test349");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 0);
    boolean var10 = var0.moveCar(1, 0, 100);
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar(10, (-1), 10);
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar((-1), 1, 100);
    boolean var25 = var0.moveCar(1, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test350");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(0, 1, 100);
    boolean var10 = var0.moveCar((-1), 1, 10);
    boolean var14 = var0.moveCar(10, 100, (-1));
    boolean var18 = var0.moveCar(1, 10, 100);
    boolean var19 = var0.redCarAtExit();
    boolean var20 = var0.redCarAtExit();
    boolean var21 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test351");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 0, (-1));
    boolean var11 = var0.moveCar((-1), 100, 100);
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(10, (-1), 10);
    boolean var21 = var0.moveCar(1, 1, 0);
    boolean var25 = var0.moveCar(100, (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test352");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar((-1), 0, 100);
    boolean var14 = var0.moveCar(10, 10, 0);
    boolean var18 = var0.moveCar(0, (-1), (-1));
    boolean var22 = var0.moveCar(100, 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test353");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(10, 1, 10);
    boolean var9 = var0.moveCar((-1), (-1), 10);
    boolean var13 = var0.moveCar(1, 0, (-1));
    boolean var17 = var0.moveCar(100, 10, 1);
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(0, 1, 10);
    boolean var26 = var0.moveCar(100, 0, (-1));
    boolean var27 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test354");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(10, (-1), 1);
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(10, 10, 0);
    boolean var19 = var0.moveCar(1, 10, 0);
    boolean var23 = var0.moveCar(100, 0, 1);
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar(10, 10, (-1));
    boolean var32 = var0.moveCar(100, 1, 0);
    boolean var33 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test355");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 0, 10);
    boolean var11 = var0.moveCar(1, (-1), 100);
    boolean var15 = var0.moveCar(100, 0, 1);
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(0, 10, 10);
    boolean var24 = var0.moveCar(0, 1, 1);
    boolean var28 = var0.moveCar(100, 0, 100);
    boolean var32 = var0.moveCar((-1), 10, 100);
    boolean var36 = var0.moveCar(100, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test356");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(10, 1, 10);
    boolean var9 = var0.moveCar((-1), (-1), 10);
    boolean var13 = var0.moveCar(1, 100, 1);
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar(100, 1, 100);
    boolean var22 = var0.moveCar(100, 0, 100);
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(100, (-1), 1);
    boolean var28 = var0.redCarAtExit();
    boolean var29 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test357");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var7 = var0.redCarAtExit();
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(1, 1, 100);
    boolean var16 = var0.moveCar(0, 10, 100);
    boolean var20 = var0.moveCar(1, 100, 0);
    boolean var24 = var0.moveCar(0, 0, 0);
    boolean var25 = var0.redCarAtExit();
    boolean var29 = var0.moveCar(100, 10, (-1));
    boolean var30 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test358");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, 0, 0);
    boolean var13 = var0.moveCar(100, 100, 100);
    boolean var17 = var0.moveCar(0, 100, 0);
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar((-1), 100, 0);
    boolean var26 = var0.moveCar((-1), 10, 10);
    boolean var30 = var0.moveCar(100, 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test359");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 0, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(0, 0, 1);
    boolean var16 = var0.moveCar(10, 100, 10);
    boolean var20 = var0.moveCar(10, (-1), (-1));
    boolean var24 = var0.moveCar(10, (-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test360");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar((-1), 1, 100);
    boolean var18 = var0.moveCar(10, (-1), 10);
    boolean var22 = var0.moveCar(0, (-1), 10);
    boolean var23 = var0.redCarAtExit();
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar(0, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test361");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var16 = var0.moveCar(0, 0, (-1));
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(0, 100, 10);
    boolean var23 = var0.redCarAtExit();
    boolean var24 = var0.redCarAtExit();
    boolean var25 = var0.redCarAtExit();
    boolean var26 = var0.redCarAtExit();
    boolean var27 = var0.redCarAtExit();
    boolean var31 = var0.moveCar(1, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test362");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar((-1), 0, 100);
    boolean var12 = var0.moveCar(0, (-1), 100);
    boolean var13 = var0.redCarAtExit();
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar(100, (-1), (-1));
    boolean var22 = var0.moveCar((-1), 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test363");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(10, 1, 0);
    boolean var18 = var0.moveCar(1, 100, 10);
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(10, 100, 10);
    boolean var27 = var0.moveCar(0, (-1), 1);
    boolean var31 = var0.moveCar((-1), 100, 100);
    boolean var35 = var0.moveCar(1, 100, 0);
    boolean var36 = var0.redCarAtExit();
    boolean var37 = var0.redCarAtExit();
    boolean var41 = var0.moveCar(1, 100, 0);
    boolean var45 = var0.moveCar((-1), 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test364");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var14 = var0.moveCar(1, 100, 1);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar((-1), 10, 1);
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(10, 100, 10);
    boolean var25 = var0.redCarAtExit();
    boolean var29 = var0.moveCar((-1), 10, (-1));
    boolean var33 = var0.moveCar(1, 1, (-1));
    boolean var37 = var0.moveCar((-1), (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test365");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(100, 10, 1);
    boolean var18 = var0.moveCar(0, 0, 0);
    boolean var22 = var0.moveCar(10, (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test366");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(100, 10, 1);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(100, 1, 1);
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar((-1), (-1), 0);
    boolean var24 = var0.moveCar(100, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test367");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 0, (-1));
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar(100, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test368");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 10, (-1));
    boolean var14 = var0.moveCar(1, 10, 10);
    boolean var18 = var0.moveCar(100, 100, 10);
    boolean var22 = var0.moveCar(100, 100, 1);
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(100, (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test369");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 10, 100);
    boolean var14 = var0.moveCar(10, 100, 1);
    boolean var18 = var0.moveCar(1, 100, 10);
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar((-1), 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test370");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(100, 100, 100);
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar(10, 0, 100);
    boolean var20 = var0.moveCar((-1), (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test371");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 10, (-1));
    boolean var14 = var0.moveCar(10, 10, (-1));
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(100, (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test372");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(10, 1, 10);
    boolean var9 = var0.moveCar((-1), (-1), 10);
    boolean var13 = var0.moveCar(1, 0, (-1));
    boolean var17 = var0.moveCar(0, 0, 0);
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar((-1), 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test373");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar((-1), 100, (-1));
    boolean var5 = var0.redCarAtExit();
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(1, 1, 100);
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(1, 1, (-1));
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(1, 100, 0);
    boolean var26 = var0.moveCar(1, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test374");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(1, 100, 100);
    boolean var13 = var0.moveCar(1, (-1), 100);
    boolean var17 = var0.moveCar(0, 100, 1);
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(10, 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test375");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, (-1), 100);
    boolean var13 = var0.moveCar((-1), 10, 0);
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar(100, 1, (-1));
    boolean var22 = var0.moveCar(1, 100, 10);
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(0, 100, (-1));
    boolean var28 = var0.redCarAtExit();
    boolean var29 = var0.redCarAtExit();
    boolean var33 = var0.moveCar(10, 10, 100);
    boolean var37 = var0.moveCar(0, 1, 100);
    boolean var41 = var0.moveCar(10, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test376");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var16 = var0.moveCar(10, 10, 1);
    boolean var20 = var0.moveCar(1, (-1), 0);
    boolean var21 = var0.redCarAtExit();
    boolean var22 = var0.redCarAtExit();
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(0, 10, 100);
    boolean var28 = var0.redCarAtExit();
    boolean var29 = var0.redCarAtExit();
    boolean var30 = var0.redCarAtExit();
    boolean var34 = var0.moveCar((-1), 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test377");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, (-1), 100);
    boolean var13 = var0.moveCar((-1), 10, 0);
    boolean var17 = var0.moveCar(0, 0, 1);
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(0, 0, (-1));
    boolean var27 = var0.moveCar(100, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test378");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(1, 100, 10);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(100, 100, 10);
    boolean var23 = var0.moveCar(100, 100, 1);
    boolean var27 = var0.moveCar(1, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test379");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar((-1), 0, 100);
    boolean var12 = var0.moveCar(0, (-1), 100);
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(0, 0, 0);
    boolean var21 = var0.moveCar(0, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test380");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 0);
    boolean var10 = var0.moveCar(1, 0, 100);
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar(10, (-1), 10);
    boolean var20 = var0.moveCar(10, 100, 100);
    boolean var24 = var0.moveCar(10, (-1), (-1));
    boolean var28 = var0.moveCar(1, (-1), 1);
    boolean var29 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test381");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar((-1), 0, 0);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(10, 0, (-1));
    boolean var23 = var0.moveCar(0, 100, 100);
    boolean var27 = var0.moveCar(1, 0, (-1));
    boolean var31 = var0.moveCar(0, 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test382");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(100, 1, 0);
    boolean var21 = var0.moveCar(0, 1, 10);
    boolean var25 = var0.moveCar(0, 10, (-1));
    boolean var26 = var0.redCarAtExit();
    boolean var27 = var0.redCarAtExit();
    boolean var31 = var0.moveCar(0, 0, 100);
    boolean var35 = var0.moveCar(0, 0, 10);
    boolean var39 = var0.moveCar(10, (-1), 0);
    boolean var40 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test383");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var13 = var0.moveCar(1, 100, 10);
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar(10, (-1), 10);
    boolean var22 = var0.moveCar(1, 100, 10);
    boolean var26 = var0.moveCar(10, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test384");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar(0, 0, 0);
    boolean var9 = var0.redCarAtExit();
    boolean var13 = var0.moveCar((-1), 1, 10);
    boolean var17 = var0.moveCar(1, 1, 1);
    boolean var18 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test385");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(10, 0, 0);
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar((-1), 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test386");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 0, (-1));
    boolean var11 = var0.moveCar((-1), 100, 100);
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar(0, (-1), 10);
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(1, 1, 1);
    boolean var22 = var0.redCarAtExit();
    boolean var26 = var0.moveCar(10, 0, 10);
    boolean var30 = var0.moveCar((-1), 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test387");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar(100, 10, 0);
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(1, 100, 0);
    boolean var25 = var0.moveCar(0, 100, 0);
    boolean var26 = var0.redCarAtExit();
    boolean var30 = var0.moveCar(100, 100, (-1));
    boolean var31 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test388");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var13 = var0.moveCar(1, 100, 10);
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar((-1), 0, 1);
    boolean var20 = var0.redCarAtExit();
    boolean var21 = var0.redCarAtExit();
    boolean var25 = var0.moveCar(100, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test389");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(100, 1, 0);
    boolean var21 = var0.moveCar(0, 1, 10);
    boolean var25 = var0.moveCar(0, 10, (-1));
    boolean var26 = var0.redCarAtExit();
    boolean var27 = var0.redCarAtExit();
    boolean var31 = var0.moveCar(0, 10, 0);
    boolean var32 = var0.redCarAtExit();
    boolean var33 = var0.redCarAtExit();
    boolean var37 = var0.moveCar((-1), (-1), 0);
    boolean var38 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test390");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 0, 10);
    boolean var11 = var0.moveCar(1, (-1), 100);
    boolean var15 = var0.moveCar(1, 0, (-1));
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(0, 100, 100);
    boolean var24 = var0.moveCar(10, 10, 100);
    boolean var28 = var0.moveCar(10, 10, 1);
    boolean var29 = var0.redCarAtExit();
    boolean var33 = var0.moveCar(100, (-1), 100);
    boolean var34 = var0.redCarAtExit();
    boolean var35 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test391");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var11 = var0.moveCar(100, 10, (-1));
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(0, 100, 100);
    boolean var18 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test392");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar((-1), 0, 100);
    boolean var12 = var0.moveCar(0, (-1), 100);
    boolean var16 = var0.moveCar(1, 10, 100);
    boolean var20 = var0.moveCar(10, 0, 100);
    boolean var21 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test393");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(10, 0, 0);
    boolean var14 = var0.moveCar((-1), 1, 10);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(100, 100, (-1));
    boolean var23 = var0.moveCar(100, 1, 10);
    boolean var27 = var0.moveCar(10, 0, 10);
    boolean var31 = var0.moveCar(10, 0, 10);
    boolean var32 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test394");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var14 = var0.moveCar(1, 100, 1);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(0, 0, 0);
    boolean var23 = var0.moveCar(100, 1, 1);
    boolean var24 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test395");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(10, 1, 10);
    boolean var9 = var0.moveCar((-1), (-1), 10);
    boolean var13 = var0.moveCar(1, 100, 1);
    boolean var17 = var0.moveCar(0, 10, 0);
    boolean var21 = var0.moveCar(10, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test396");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar((-1), 0, 100);
    boolean var14 = var0.moveCar(100, 0, 1);
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(1, 100, 0);
    boolean var21 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test397");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, (-1), 100);
    boolean var13 = var0.moveCar((-1), 10, 0);
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar(100, 1, (-1));
    boolean var22 = var0.moveCar(100, 1, 0);
    boolean var26 = var0.moveCar(1, 10, 1);
    boolean var30 = var0.moveCar(1, 10, 1);
    boolean var34 = var0.moveCar((-1), 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test398");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var11 = var0.moveCar(0, 10, (-1));
    boolean var15 = var0.moveCar(1, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test399");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar((-1), 0, 100);
    boolean var12 = var0.moveCar(0, (-1), 100);
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(0, 10, 1);
    boolean var21 = var0.moveCar(0, 100, (-1));
    boolean var25 = var0.moveCar(1, (-1), 10);
    boolean var29 = var0.moveCar(100, 10, 1);
    boolean var30 = var0.redCarAtExit();
    boolean var31 = var0.redCarAtExit();
    boolean var32 = var0.redCarAtExit();
    boolean var36 = var0.moveCar(1, (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test400");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var13 = var0.redCarAtExit();
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar((-1), 100, 0);
    boolean var22 = var0.moveCar((-1), 10, 100);
    boolean var26 = var0.moveCar(10, 100, 0);
    boolean var27 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test401");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(10, 1, 10);
    boolean var9 = var0.moveCar((-1), (-1), 10);
    boolean var13 = var0.moveCar(1, 0, (-1));
    boolean var17 = var0.moveCar(100, 10, 1);
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(0, 1, 10);
    boolean var26 = var0.moveCar(10, 10, 1);
    boolean var30 = var0.moveCar(10, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test402");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(1, 100, 10);
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(100, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test403");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 10, 0);
    boolean var11 = var0.moveCar(1, 0, (-1));
    boolean var15 = var0.moveCar(1, 100, 100);
    boolean var16 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test404");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var4 = var0.redCarAtExit();
    boolean var5 = var0.redCarAtExit();
    boolean var9 = var0.moveCar(0, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar((-1), 0, (-1));
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(0, 1, 10);
    boolean var24 = var0.moveCar(100, 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test405");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(0, 0, 1);
    boolean var16 = var0.moveCar(100, (-1), 0);
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(100, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test406");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var11 = var0.moveCar((-1), 0, 100);
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar((-1), 10, 1);
    boolean var21 = var0.moveCar(100, 100, 1);
    boolean var25 = var0.moveCar((-1), 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test407");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 0, 1);
    boolean var10 = var0.moveCar(10, 1, 1);
    boolean var14 = var0.moveCar(100, 0, 1);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(1, (-1), 1);
    boolean var23 = var0.moveCar(10, (-1), (-1));
    boolean var27 = var0.moveCar(0, 0, (-1));
    boolean var28 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test408");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 0);
    boolean var10 = var0.moveCar(1, 0, 100);
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar(10, (-1), 10);
    boolean var20 = var0.moveCar((-1), 100, 100);
    boolean var24 = var0.moveCar((-1), 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test409");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 10, 0);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var13 = var0.moveCar(1, 100, 10);
    boolean var17 = var0.moveCar(100, 1, 0);
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test410");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar((-1), 0, (-1));
    boolean var14 = var0.moveCar((-1), 100, 100);
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(1, 0, 100);
    boolean var24 = var0.moveCar(100, (-1), 1);
    boolean var28 = var0.moveCar(10, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test411");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var7 = var0.redCarAtExit();
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(1, 1, 100);
    boolean var16 = var0.moveCar(0, 10, 100);
    boolean var20 = var0.moveCar(0, 1, 10);
    boolean var24 = var0.moveCar(0, 10, 10);
    boolean var28 = var0.moveCar(0, 1, 10);
    boolean var29 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test412");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, (-1), 100);
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar(100, 100, 0);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar((-1), 100, 0);
    boolean var23 = var0.moveCar(0, 10, (-1));
    boolean var24 = var0.redCarAtExit();
    boolean var25 = var0.redCarAtExit();
    boolean var29 = var0.moveCar(0, (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test413");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 0, (-1));
    boolean var11 = var0.moveCar((-1), 100, 100);
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar(0, (-1), 1);
    boolean var20 = var0.moveCar(100, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test414");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(10, 1, 0);
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(1, 1, (-1));
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar(0, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test415");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, (-1), 100);
    boolean var13 = var0.moveCar((-1), 10, 0);
    boolean var17 = var0.moveCar(1, 100, 1);
    boolean var21 = var0.moveCar(0, 10, (-1));
    boolean var22 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test416");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(10, 0, 0);
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(100, 1, 1);
    boolean var19 = var0.moveCar(1, (-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test417");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 0, 1);
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(10, 1, 1);
    boolean var15 = var0.moveCar(0, 10, 1);
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(1, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test418");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar((-1), 0, 100);
    boolean var14 = var0.moveCar(100, 0, 1);
    boolean var18 = var0.moveCar(100, 0, 0);
    boolean var22 = var0.moveCar((-1), (-1), 100);
    boolean var26 = var0.moveCar(1, 1, 100);
    boolean var27 = var0.redCarAtExit();
    boolean var28 = var0.redCarAtExit();
    boolean var32 = var0.moveCar(0, 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test419");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(10, 1, 0);
    boolean var18 = var0.moveCar((-1), 0, 10);
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(10, 0, (-1));
    boolean var27 = var0.moveCar(1, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test420");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 0, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar((-1), 1, (-1));
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(10, 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test421");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var14 = var0.moveCar(1, 100, 1);
    boolean var18 = var0.moveCar(10, 0, 10);
    boolean var22 = var0.moveCar(100, (-1), 1);
    boolean var26 = var0.moveCar((-1), 1, 0);
    boolean var30 = var0.moveCar(1, 0, 1);
    boolean var31 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test422");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 10, (-1));
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar((-1), 10, 1);
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(1, (-1), 100);
    boolean var26 = var0.moveCar((-1), (-1), 10);
    boolean var30 = var0.moveCar(10, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test423");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(10, 10, 100);
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(100, 10, 10);
    boolean var25 = var0.redCarAtExit();
    boolean var26 = var0.redCarAtExit();
    boolean var27 = var0.redCarAtExit();
    boolean var28 = var0.redCarAtExit();
    boolean var29 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test424");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var13 = var0.moveCar(1, 10, 10);
    boolean var17 = var0.moveCar(0, (-1), 0);
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(1, 1, 1);
    boolean var27 = var0.moveCar(10, 10, (-1));
    boolean var28 = var0.redCarAtExit();
    boolean var29 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test425");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar((-1), 0, 100);
    boolean var12 = var0.moveCar(10, 10, 1);
    boolean var16 = var0.moveCar((-1), 0, 0);
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test426");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar((-1), 0, (-1));
    boolean var15 = var0.moveCar(100, 1, 0);
    boolean var19 = var0.moveCar(1, (-1), 0);
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(1, 100, 0);
    boolean var25 = var0.redCarAtExit();
    boolean var26 = var0.redCarAtExit();
    boolean var27 = var0.redCarAtExit();
    boolean var31 = var0.moveCar(100, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test427");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(10, 10, 100);
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(1, 0, (-1));
    boolean var26 = var0.moveCar(1, 1, 100);
    boolean var27 = var0.redCarAtExit();
    boolean var28 = var0.redCarAtExit();
    boolean var29 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test428");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar(10, 1, 0);
    boolean var8 = var0.moveCar((-1), 0, 100);
    boolean var12 = var0.moveCar(10, 10, 1);
    boolean var13 = var0.redCarAtExit();
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar((-1), 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test429");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var16 = var0.moveCar(10, 10, 1);
    boolean var20 = var0.moveCar(1, (-1), 0);
    boolean var24 = var0.moveCar(0, 100, (-1));
    boolean var28 = var0.moveCar(100, (-1), 100);
    boolean var32 = var0.moveCar(10, 1, 0);
    boolean var36 = var0.moveCar(0, (-1), 0);
    boolean var37 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test430");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(100, 10, 1);
    boolean var18 = var0.moveCar(0, 0, 0);
    boolean var22 = var0.moveCar(100, (-1), 10);
    boolean var26 = var0.moveCar(10, 0, 1);
    boolean var30 = var0.moveCar(0, 0, 10);
    boolean var34 = var0.moveCar(10, 1, 10);
    boolean var38 = var0.moveCar(100, 1, 0);
    boolean var39 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test431");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(100, 10, 1);
    boolean var13 = var0.moveCar(0, 100, (-1));
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar(0, 100, 0);
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(0, 1, 10);
    boolean var27 = var0.moveCar(1, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test432");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar((-1), 10, 100);
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test433");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(10, 1, 10);
    boolean var9 = var0.moveCar((-1), (-1), 10);
    boolean var13 = var0.moveCar(1, 0, (-1));
    boolean var17 = var0.moveCar(0, 0, 0);
    boolean var21 = var0.moveCar(10, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test434");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar((-1), 100, (-1));
    boolean var5 = var0.redCarAtExit();
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(1, 1, 100);
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(1, 1, (-1));
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(0, 100, 0);
    boolean var26 = var0.moveCar((-1), 10, 0);
    boolean var30 = var0.moveCar(1, 0, 10);
    boolean var34 = var0.moveCar(1, 1, 100);
    boolean var35 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test435");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 0, (-1));
    boolean var11 = var0.moveCar(10, 10, 0);
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar(10, 1, 1);
    boolean var20 = var0.moveCar((-1), 1, 1);
    boolean var21 = var0.redCarAtExit();
    boolean var25 = var0.moveCar(0, 0, 1);
    boolean var29 = var0.moveCar(10, 0, 100);
    boolean var30 = var0.redCarAtExit();
    boolean var31 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test436");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar((-1), 0, (-1));
    boolean var15 = var0.moveCar(100, 1, 0);
    boolean var19 = var0.moveCar(1, 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test437");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(0, 1, 10);
    boolean var14 = var0.moveCar(10, 10, 0);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(100, 1, (-1));
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(10, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test438");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var16 = var0.moveCar(0, 0, (-1));
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(0, 100, 10);
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(100, 100, (-1));
    boolean var28 = var0.redCarAtExit();
    boolean var32 = var0.moveCar((-1), 10, (-1));
    boolean var36 = var0.moveCar(0, 0, 1);
    boolean var37 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test439");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(100, 1, 0);
    boolean var21 = var0.moveCar(0, 1, 10);
    boolean var25 = var0.moveCar(0, 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test440");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar((-1), 1, 1);
    boolean var13 = var0.moveCar(0, 10, 10);
    boolean var17 = var0.moveCar(100, 0, 10);
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar((-1), 1, 10);
    boolean var27 = var0.moveCar(0, (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test441");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, (-1), 100);
    boolean var13 = var0.moveCar((-1), 10, 0);
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar(0, 10, 1);
    boolean var22 = var0.moveCar(0, 10, 0);
    boolean var26 = var0.moveCar(100, (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test442");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var13 = var0.redCarAtExit();
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar((-1), 100, 1);
    boolean var22 = var0.moveCar(0, 10, (-1));
    boolean var26 = var0.moveCar(100, (-1), 0);
    boolean var27 = var0.redCarAtExit();
    boolean var31 = var0.moveCar(10, 0, 1);
    boolean var35 = var0.moveCar(100, 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test443");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 0);
    boolean var10 = var0.moveCar(1, 0, 100);
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar((-1), 10, 10);
    boolean var19 = var0.moveCar(100, 0, 10);
    boolean var23 = var0.moveCar(10, 1, 0);
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar(0, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test444");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar((-1), (-1), 100);
    boolean var21 = var0.moveCar(0, 1, (-1));
    boolean var22 = var0.redCarAtExit();
    boolean var23 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test445");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var14 = var0.moveCar(1, 100, 1);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar((-1), 10, 1);
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(10, 100, 10);
    boolean var25 = var0.redCarAtExit();
    boolean var29 = var0.moveCar((-1), 100, 10);
    boolean var33 = var0.moveCar(1, 10, 100);
    boolean var34 = var0.redCarAtExit();
    boolean var38 = var0.moveCar(100, 10, 1);
    boolean var42 = var0.moveCar(100, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test446");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(10, 1, 10);
    boolean var9 = var0.moveCar((-1), (-1), 10);
    boolean var13 = var0.moveCar(1, 0, (-1));
    boolean var17 = var0.moveCar(0, 0, 0);
    boolean var21 = var0.moveCar(100, (-1), 1);
    boolean var22 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test447");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var14 = var0.moveCar(1, 10, 0);
    boolean var18 = var0.moveCar(10, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test448");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var13 = var0.moveCar(10, 10, 10);
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar(1, 0, 0);
    boolean var19 = var0.redCarAtExit();
    boolean var20 = var0.redCarAtExit();
    boolean var21 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test449");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var16 = var0.moveCar(10, 10, 1);
    boolean var20 = var0.moveCar(1, (-1), 0);
    boolean var21 = var0.redCarAtExit();
    boolean var22 = var0.redCarAtExit();
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(0, 10, 100);
    boolean var31 = var0.moveCar(10, (-1), 0);
    boolean var32 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test450");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var13 = var0.moveCar(0, 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test451");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 0, (-1));
    boolean var11 = var0.moveCar(10, 10, 0);
    boolean var15 = var0.moveCar(100, 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test452");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar((-1), 0, (-1));
    boolean var15 = var0.moveCar(100, 1, 0);
    boolean var19 = var0.moveCar(1, (-1), 0);
    boolean var23 = var0.moveCar(100, 10, 0);
    boolean var27 = var0.moveCar(100, (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test453");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar((-1), 0, (-1));
    boolean var15 = var0.moveCar(100, 1, 0);
    boolean var19 = var0.moveCar(1, (-1), 0);
    boolean var23 = var0.moveCar((-1), (-1), 10);
    boolean var27 = var0.moveCar((-1), 1, 1);
    boolean var31 = var0.moveCar(1, (-1), (-1));
    boolean var35 = var0.moveCar((-1), 10, 0);
    boolean var36 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test454");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(1, 100, (-1));
    boolean var24 = var0.moveCar(1, 1, 100);
    boolean var28 = var0.moveCar((-1), 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test455");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var16 = var0.moveCar(0, 0, (-1));
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(0, 100, 10);
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(1, 100, (-1));
    boolean var31 = var0.moveCar(0, (-1), 100);
    boolean var32 = var0.redCarAtExit();
    boolean var33 = var0.redCarAtExit();
    boolean var34 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test456");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 10, 0);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar((-1), 10, 0);
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar((-1), 10, (-1));
    boolean var23 = var0.moveCar(0, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test457");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 0, 10);
    boolean var11 = var0.moveCar(1, (-1), 100);
    boolean var15 = var0.moveCar(100, 0, 1);
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar(0, 10, 10);
    boolean var24 = var0.moveCar(0, 1, 1);
    boolean var28 = var0.moveCar(100, (-1), 1);
    boolean var32 = var0.moveCar(0, (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test458");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(0, (-1), (-1));
    boolean var14 = var0.moveCar((-1), 100, 10);
    boolean var18 = var0.moveCar(1, (-1), 10);
    boolean var19 = var0.redCarAtExit();
    boolean var20 = var0.redCarAtExit();
    boolean var21 = var0.redCarAtExit();
    boolean var25 = var0.moveCar(1, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test459");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 0);
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(0, 0, (-1));
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar(0, 0, (-1));
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(10, 100, 10);
    boolean var23 = var0.redCarAtExit();
    boolean var24 = var0.redCarAtExit();
    boolean var28 = var0.moveCar(10, 1, 1);
    boolean var32 = var0.moveCar((-1), 10, 10);
    boolean var33 = var0.redCarAtExit();
    boolean var37 = var0.moveCar((-1), 1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test460");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var16 = var0.moveCar(10, 10, 1);
    boolean var20 = var0.moveCar(1, (-1), 0);
    boolean var24 = var0.moveCar(0, 100, (-1));
    boolean var28 = var0.moveCar(100, (-1), 100);
    boolean var32 = var0.moveCar(10, 0, 1);
    boolean var33 = var0.redCarAtExit();
    boolean var34 = var0.redCarAtExit();
    boolean var35 = var0.redCarAtExit();
    boolean var39 = var0.moveCar(0, 1, 10);
    boolean var43 = var0.moveCar(1, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test461");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, 0, 0);
    boolean var13 = var0.moveCar((-1), 10, 1);
    boolean var17 = var0.moveCar(1, (-1), (-1));
    boolean var21 = var0.moveCar(100, 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test462");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 0, (-1));
    boolean var11 = var0.moveCar(10, 10, 0);
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar(10, 1, 1);
    boolean var20 = var0.moveCar(0, 100, 0);
    boolean var21 = var0.redCarAtExit();
    boolean var22 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test463");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 0);
    boolean var10 = var0.moveCar(1, 0, 100);
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar(10, (-1), 10);
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(1, 10, 100);
    boolean var22 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test464");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(100, 10, 1);
    boolean var18 = var0.moveCar(0, 0, 0);
    boolean var22 = var0.moveCar((-1), 100, 100);
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(100, 1, 1);
    boolean var31 = var0.moveCar(10, 10, (-1));
    boolean var32 = var0.redCarAtExit();
    boolean var36 = var0.moveCar(0, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test465");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar((-1), 100, (-1));
    boolean var5 = var0.redCarAtExit();
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(1, 1, 100);
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var17 = var0.moveCar(1, 1, (-1));
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(0, 100, 0);
    boolean var23 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test466");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(10, 1, 0);
    boolean var18 = var0.moveCar(10, (-1), 0);
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar((-1), 10, 100);
    boolean var27 = var0.moveCar(10, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test467");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(100, 10, 1);
    boolean var13 = var0.moveCar(0, 100, (-1));
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(0, 10, 0);
    boolean var26 = var0.moveCar(10, 10, 0);
    boolean var30 = var0.moveCar(10, 0, 10);
    boolean var31 = var0.redCarAtExit();
    boolean var35 = var0.moveCar(100, (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test468");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var16 = var0.moveCar(10, 10, 1);
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    boolean var20 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test469");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, (-1), (-1));
    boolean var14 = var0.moveCar(1, 10, 0);
    boolean var18 = var0.moveCar(0, 1, (-1));
    boolean var22 = var0.moveCar((-1), 1, 0);
    boolean var23 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test470");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var16 = var0.moveCar(0, 0, (-1));
    boolean var20 = var0.moveCar(1, 100, 10);
    boolean var21 = var0.redCarAtExit();
    boolean var25 = var0.moveCar(0, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test471");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(100, 10, 1);
    boolean var18 = var0.moveCar(0, 0, 0);
    boolean var22 = var0.moveCar(100, 100, 1);
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(0, 10, (-1));
    boolean var28 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test472");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(0, 1, 100);
    boolean var10 = var0.moveCar(0, 10, 0);
    boolean var14 = var0.moveCar(10, 1, (-1));
    boolean var15 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test473");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(1, 100, 10);
    boolean var18 = var0.moveCar(1, 100, 0);
    boolean var22 = var0.moveCar((-1), (-1), 10);
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(10, 10, 1);
    boolean var31 = var0.moveCar(10, 10, 100);
    boolean var32 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test474");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(1, 1, (-1));
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar((-1), 1, 1);
    boolean var24 = var0.moveCar(100, 0, (-1));
    boolean var25 = var0.redCarAtExit();
    boolean var29 = var0.moveCar((-1), (-1), (-1));
    boolean var30 = var0.redCarAtExit();
    boolean var31 = var0.redCarAtExit();
    boolean var32 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test475");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(1, (-1), 10);
    boolean var9 = var0.moveCar(0, 0, 0);
    boolean var13 = var0.moveCar((-1), 10, 1);
    boolean var17 = var0.moveCar(1, (-1), (-1));
    boolean var18 = var0.redCarAtExit();
    boolean var19 = var0.redCarAtExit();
    boolean var23 = var0.moveCar(100, 10, 1);
    boolean var24 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test476");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 0);
    boolean var10 = var0.moveCar(1, 0, 100);
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(10, 100, 10);
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar((-1), 100, 100);
    boolean var22 = var0.redCarAtExit();
    boolean var23 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test477");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(100, 10, 1);
    boolean var10 = var0.redCarAtExit();
    boolean var14 = var0.moveCar(100, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test478");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 0, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar((-1), 1, (-1));
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(10, 100, 100);
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(0, 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test479");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(0, 0, 1);
    boolean var16 = var0.moveCar(1, (-1), 0);
    boolean var20 = var0.moveCar(10, (-1), 10);
    boolean var21 = var0.redCarAtExit();
    boolean var22 = var0.redCarAtExit();
    boolean var23 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test480");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(10, 0, 10);
    boolean var19 = var0.moveCar(0, 10, (-1));
    boolean var20 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test481");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 0, 1);
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar((-1), 1, 0);
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar(10, 1, (-1));
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(0, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test482");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(10, (-1), 1);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(1, 1, 100);
    boolean var22 = var0.redCarAtExit();
    boolean var26 = var0.moveCar(0, 10, 100);
    boolean var30 = var0.moveCar(10, 1, 100);
    boolean var34 = var0.moveCar(10, 10, 0);
    boolean var38 = var0.moveCar(1, (-1), (-1));
    boolean var39 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test483");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 0);
    boolean var10 = var0.moveCar(1, 0, 100);
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar(10, (-1), 10);
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(10, 1, 10);
    boolean var25 = var0.moveCar((-1), 100, 10);
    boolean var29 = var0.moveCar(100, 10, 10);
    boolean var33 = var0.moveCar(100, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test484");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 0, 10);
    boolean var11 = var0.moveCar(100, 0, 100);
    boolean var15 = var0.moveCar(1, 100, 100);
    boolean var19 = var0.moveCar(0, 10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test485");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 10, 0);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(0, 0, 0);
    boolean var16 = var0.moveCar((-1), 100, 1);
    boolean var20 = var0.moveCar(100, (-1), 1);
    boolean var24 = var0.moveCar(1, (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test486");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(100, 10, 1);
    boolean var13 = var0.moveCar(0, 100, (-1));
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar(0, 100, 0);
    boolean var19 = var0.redCarAtExit();
    boolean var20 = var0.redCarAtExit();
    boolean var24 = var0.moveCar(100, 0, 0);
    boolean var28 = var0.moveCar(100, 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test487");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(10, 1, 10);
    boolean var9 = var0.moveCar((-1), (-1), 10);
    boolean var13 = var0.moveCar(1, 0, (-1));
    boolean var17 = var0.moveCar(100, 10, 1);
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(10, 10, 1);
    boolean var23 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test488");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var4 = var0.moveCar((-1), 100, (-1));
    boolean var5 = var0.redCarAtExit();
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(1, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test489");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(10, 1, 10);
    boolean var9 = var0.moveCar((-1), (-1), 10);
    boolean var13 = var0.moveCar(1, 1, 1);
    boolean var17 = var0.moveCar(0, (-1), 0);
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(100, 0, 100);
    boolean var26 = var0.moveCar((-1), 1, 1);
    boolean var27 = var0.redCarAtExit();
    boolean var28 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test490");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var9 = var0.moveCar(100, 10, 1);
    boolean var10 = var0.redCarAtExit();
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(100, 1, 1);
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar((-1), (-1), 0);
    boolean var24 = var0.moveCar(0, 1, 100);
    boolean var25 = var0.redCarAtExit();
    boolean var29 = var0.moveCar(0, (-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test491");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 0);
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(0, 0, (-1));
    boolean var15 = var0.moveCar(1, (-1), 1);
    boolean var19 = var0.moveCar(100, 1, 100);
    boolean var23 = var0.moveCar(0, 1, 100);
    boolean var27 = var0.moveCar((-1), 1, (-1));
    boolean var31 = var0.moveCar(0, 0, 100);
    boolean var35 = var0.moveCar((-1), 10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test492");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 0);
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(0, 0, (-1));
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar(0, 0, (-1));
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(10, 100, 10);
    boolean var23 = var0.redCarAtExit();
    boolean var27 = var0.moveCar(100, (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test493");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var10 = var0.moveCar(10, 100, 1);
    boolean var14 = var0.moveCar(10, 1, 0);
    boolean var15 = var0.redCarAtExit();
    boolean var16 = var0.redCarAtExit();
    boolean var17 = var0.redCarAtExit();
    boolean var18 = var0.redCarAtExit();
    boolean var22 = var0.moveCar(0, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test494");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar(0, 1, (-1));
    boolean var14 = var0.moveCar(1, 1, (-1));
    boolean var18 = var0.moveCar(100, 10, 10);
    boolean var22 = var0.moveCar(100, 1, 0);
    boolean var26 = var0.moveCar(10, 1, 10);
    boolean var30 = var0.moveCar(1, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test495");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var5 = var0.moveCar(100, 1, 10);
    boolean var6 = var0.redCarAtExit();
    boolean var7 = var0.redCarAtExit();
    boolean var11 = var0.moveCar(10, 1, 1);
    boolean var15 = var0.moveCar(100, 0, (-1));
    boolean var16 = var0.redCarAtExit();
    boolean var20 = var0.moveCar((-1), (-1), 10);
    boolean var24 = var0.moveCar(1, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test496");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(1, 10, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var12 = var0.moveCar(10, (-1), (-1));
    boolean var16 = var0.moveCar(0, 0, (-1));
    boolean var17 = var0.redCarAtExit();
    boolean var21 = var0.moveCar(100, 0, (-1));
    boolean var25 = var0.moveCar(100, 1, 10);
    boolean var26 = var0.redCarAtExit();
    boolean var27 = var0.redCarAtExit();
    boolean var28 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test497");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar((-1), 0, 100);
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var13 = var0.redCarAtExit();
    boolean var14 = var0.redCarAtExit();
    boolean var15 = var0.redCarAtExit();
    boolean var19 = var0.moveCar(10, 1, 0);
    boolean var20 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test498");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 1);
    boolean var10 = var0.moveCar((-1), 0, 100);
    boolean var11 = var0.redCarAtExit();
    boolean var15 = var0.moveCar(0, 0, 100);
    boolean var19 = var0.moveCar(1, 10, 10);
    boolean var23 = var0.moveCar(10, 100, 1);
    boolean var24 = var0.redCarAtExit();
    boolean var25 = var0.redCarAtExit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test499");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var6 = var0.moveCar(10, 10, 0);
    boolean var10 = var0.moveCar(1, 0, 100);
    boolean var11 = var0.redCarAtExit();
    boolean var12 = var0.redCarAtExit();
    boolean var16 = var0.moveCar(100, 100, 0);
    boolean var20 = var0.moveCar((-1), 1, 0);
    boolean var21 = var0.redCarAtExit();
    boolean var25 = var0.moveCar(100, 100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test500");


    rushgame.RushHour var0 = new rushgame.RushHour();
    boolean var1 = var0.redCarAtExit();
    boolean var2 = var0.redCarAtExit();
    boolean var3 = var0.redCarAtExit();
    boolean var7 = var0.moveCar(10, 0, 10);
    boolean var8 = var0.redCarAtExit();
    boolean var9 = var0.redCarAtExit();
    boolean var13 = var0.moveCar(100, 1, 100);
    boolean var14 = var0.redCarAtExit();
    boolean var18 = var0.moveCar(10, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

}
