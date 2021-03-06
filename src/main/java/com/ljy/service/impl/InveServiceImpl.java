package com.ljy.service.impl;

import com.ljy.mapper.InveMapper;
import com.ljy.domain.Inve;
import com.ljy.service.InveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lijingyu
 * @date 2019/9/14 14:05
 */
@Service
public class InveServiceImpl implements InveService {
    @Autowired
    private InveMapper inveMapper;
    @Override
    public List<Inve> findAll() {
        return inveMapper.findAll();
    }
}
