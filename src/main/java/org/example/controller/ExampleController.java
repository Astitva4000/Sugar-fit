package org.example.controller;

@RestController
@RequestMapping("/example")
public class ExampleController {

    private final ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @PostMapping
    public ExampleResponse process(@Valid @RequestBody ExampleRequest request) {
        return exampleService.process();
    }
}
