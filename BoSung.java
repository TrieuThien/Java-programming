public void tinhGiaTaxi(float soMetDi) {
        float soTien = 0;
        if (soMetDi < 2000) 
            soTien = 25000;
        else if (soMetDi < 30000) {
            if (soMetDi % 200 == 0)
                soTien = 25000 + ((soMetDi - 2000) / 200) * 2500;
            else
                soTien = 25000 + ((soMetDi - 2000) / 200) * 2500 + 2500;
        }
        else {
            soTien = 25000 + (28000 * 2500) + (soMetDi - 30);
        }
    }
