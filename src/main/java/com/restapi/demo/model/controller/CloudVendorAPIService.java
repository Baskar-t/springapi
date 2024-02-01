package com.restapi.demo.model.controller;

import com.restapi.demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService
{
    CloudVendor cloudVendor;
    @GetMapping("{vendorID}")
    public CloudVendor getCloudVendorDetails(String vendorId)
    {
        return cloudVendor;
      //  return new CloudVendor("C1","Vendor_1","Address_one","XXXX");

    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "cloud vendor created successfully";

    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "cloud vendor updated successfully";

    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorID)
    {
        this.cloudVendor = null;
        return "cloud vendor deleted successfully";

    }
}
