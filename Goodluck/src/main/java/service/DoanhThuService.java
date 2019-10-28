
package service;

import entity.DoanhThu;
import org.springframework.beans.factory.annotation.Autowired;
import repository.DoanhThuRepository;
import org.springframework.stereotype.Service;

@Service
public class DoanhThuService
{
    @Autowired
    DoanhThuRepository doanhThuRepository;
    
    public DoanhThu save(final DoanhThu doanhThu) {
        return (DoanhThu)this.doanhThuRepository.save(doanhThu);
    }
}