package hello.topic;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @ApiOperation(value = "View a list of available topics",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved topics"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @RequestMapping(method = RequestMethod.GET, value="/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @ApiOperation(value = "Search a topic with an ID",response = Topic.class)
    @RequestMapping(method = RequestMethod.GET, value="/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/topics/{id}")
    public void updateTopic(@PathVariable String id, @RequestBody Topic topic) {
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }
}
