package com.example.bus.uporabnik.busaplication;

        import android.util.Log;

        import org.json.JSONArray;
        import org.json.JSONObject;

        import java.util.ArrayList;
        import java.util.List;

/**
 * Created by Uporabnik on 21. 06. 2016.
 */
public class JsonParser {
    public JSONArray buses, arrivals = new JSONArray();
    public JSONArray dataJsonArr = new JSONArray();
    public List<Maindata> data = new ArrayList<>();
    public List<Integer> integer = new ArrayList<>();
    public List<Maindata> getStringArray(JSONObject obj){
        try{
            dataJsonArr = obj.getJSONArray("stations");
            for(int i = 0;i < dataJsonArr.length();i++){
                JSONObject trenutniObjekt = dataJsonArr.getJSONObject(i);
                Maindata mainD = new Maindata();
                mainD.nameStation = trenutniObjekt.getString("name");
                data.add(mainD);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return data;
    }

    public List<Maindata> getStations(JSONObject object){
        try {
            dataJsonArr = object.getJSONArray("stations");
            for (int j = 0;j < dataJsonArr.length(); j++) {
                JSONObject postaja = dataJsonArr.getJSONObject(j);
                buses = postaja.getJSONArray("buses");
                for(int i = 0; i <buses.length(); i++){
                    JSONObject bus = buses.getJSONObject(i);
                    arrivals = bus.getJSONArray("arrivals");
                    for(int k = 0; k < arrivals.length();k++){
                        JSONObject Casprihoda = arrivals.getJSONObject(k);
                        Maindata mainD = new Maindata();
                        mainD.ArrivalsTimes = Casprihoda.getInt("arrivals");
                        data.add(mainD);
                    }
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return data;
    }

}