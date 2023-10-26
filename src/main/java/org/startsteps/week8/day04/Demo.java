package org.startsteps.week8.day04;


import java.io.*;

public class Demo {

    public static void main(String[] args) {
        // Serialization
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/org/startsteps/week8/day04/darwin.out");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            DarwinTest darwinTest = new DarwinTest();
            darwinTest.setVersion(400);
            objectOutputStream.writeObject(darwinTest);
            objectOutputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Deserialization
        try (FileInputStream fileInputStream = new FileInputStream("src/main/java/org/startsteps/week8/day04/darwin.out");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            DarwinTest object = (DarwinTest) objectInputStream.readObject();

            if (object.contain != null) {
                System.out.println("Darwin test version: " + object.version
                        + " Contain version: " + object.contain.containVersion
                        + " Darwin version: " + object.darwinVersion);
            } else {
                System.out.println("Darwin test version: " + object.version
                        + " Contain version: " + object.contain
                        + " Darwin version: " + object.darwinVersion);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    // The function closingStreamWithTryWithResource and closingStreamWithoutTryWithResource are doing the same thing
    void closingStreamWithTryWithResource() {
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/org/startsteps/week8/day04/darwin.out")) {
            fileOutputStream.getChannel();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void closingStreamWithoutTryWithResource() {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("src/main/java/org/startsteps/week8/day04/darwin.out");
            fileOutputStream.getChannel();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

// Command + N For code generation

class DarwinTest extends Darwin implements Serializable {
    int version = 66;
    transient Contain contain = new Contain(); // Ignore this object while serializing (if transient keyword)

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Contain getContain() {
        return contain;
    }

    public void setContain(Contain contain) {
        this.contain = contain;
    }
}

class Darwin {
    int darwinVersion = 10;
}

class Contain implements Serializable {
    int containVersion = 11;
}