package works.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import works.service.domain.WorkUnit;

@RestController
public class SampleWorkController {

    @Autowired
    private WorkUnitGateway workUnitGateway;

    @GetMapping("/generateWork")
    public WorkUnit generateWork(WorkUnit workUnit) {
        workUnitGateway.generate(workUnit);
        return workUnit;
    }
}
