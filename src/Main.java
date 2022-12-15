import java.util.*;

public class Main {

        private HashMap<String, Integer> woordenTel = new HashMap<>();
        private String zin = "to be or not to be to";

        public void tellen() {
            String woorden[] = zin.split(" ");
            for (String woord : woorden) {
                if (!woordenTel.containsKey(woord)) {
                    woordenTel.put(woord, 1);
                } else {
                    woordenTel.put(woord, woordenTel.get(woord) + 1);
                }
            }
        }

        public void max() {
            ArrayList<String> lijstWoorden = new ArrayList<>();
            int maximum = Collections.max(woordenTel.values());
            for (String woord : woordenTel.keySet()) {
                if (woordenTel.get(woord) == maximum) {
                    lijstWoorden.add(woord);
                    woordenTel.remove(woord);
                }
            }
        }


        public void meestVoorkomtVerwijderen() {
            System.out.println(woordenTel);
            int max = Collections.max(woordenTel.values());
            Iterator it = woordenTel.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();
                //System.out.println(pair.getKey() + " = " + pair.getValue());
                if (pair.getValue().equals(max)) {
                    it.remove();
                }
            }
            System.out.println(woordenTel);
        }

        @Override
        public String toString() {
            return "Tellen{" +
                    "woordenTel=" + woordenTel +
                    ", zin='" + zin + '\'' +
                    '}';
        }
    }
