// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    /// <summary>
    /// Provides a [DigitalOcean Monitoring](https://docs.digitalocean.com/reference/api/digitalocean/#tag/Monitoring)
    /// resource. Monitor alerts can be configured to alert about, e.g., disk or memory
    /// usage exceeding a certain threshold or traffic at a certain limit. Notifications
    /// can be sent to either an email address or a Slack channel.
    /// 
    /// ## Import
    /// 
    /// Monitor alerts can be imported using the monitor alert `uuid`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import digitalocean:index/monitorAlert:MonitorAlert cpu_alert b8ecd2ab-2267-4a5e-8692-cbf1d32583e3
    /// ```
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/monitorAlert:MonitorAlert")]
    public partial class MonitorAlert : global::Pulumi.CustomResource
    {
        /// <summary>
        /// How to send notifications about the alerts. This is a list with one element, .
        /// Note that for Slack, the DigitalOcean app needs to have permissions for your workspace. You can
        /// read more in [Slack's documentation](https://slack.com/intl/en-dk/help/articles/222386767-Manage-app-installation-settings-for-your-workspace)
        /// </summary>
        [Output("alerts")]
        public Output<Outputs.MonitorAlertAlerts> Alerts { get; private set; } = null!;

        /// <summary>
        /// The comparison for `value`.
        /// This may be either `GreaterThan` or `LessThan`.
        /// </summary>
        [Output("compare")]
        public Output<string> Compare { get; private set; } = null!;

        /// <summary>
        /// The description of the alert.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The status of the alert.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// A list of IDs for the resources to which the alert policy applies.
        /// </summary>
        [Output("entities")]
        public Output<ImmutableArray<string>> Entities { get; private set; } = null!;

        /// <summary>
        /// A list of tags. When an included tag is added to a resource, the alert policy will apply to it.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// The type of the alert.
        /// This may be one of `v1/insights/droplet/load_1`, `v1/insights/droplet/load_5`, `v1/insights/droplet/load_15`,
        /// `v1/insights/droplet/memory_utilization_percent`, `v1/insights/droplet/disk_utilization_percent`,
        /// `v1/insights/droplet/cpu`, `v1/insights/droplet/disk_read`, `v1/insights/droplet/disk_write`,
        /// `v1/insights/droplet/public_outbound_bandwidth`, `v1/insights/droplet/public_inbound_bandwidth`,
        /// `v1/insights/droplet/private_outbound_bandwidth`, `v1/insights/droplet/private_inbound_bandwidth`,
        /// `v1/insights/lbaas/avg_cpu_utilization_percent`, `v1/insights/lbaas/connection_utilization_percent`,
        /// `v1/insights/lbaas/droplet_health`, `v1/insights/lbaas/tls_connections_per_second_utilization_percent`,
        /// `v1/insights/lbaas/increase_in_http_error_rate_percentage_5xx`, `v1/insights/lbaas/increase_in_http_error_rate_percentage_4xx`,
        /// `v1/insights/lbaas/increase_in_http_error_rate_count_5xx`, `v1/insights/lbaas/increase_in_http_error_rate_count_4xx`,
        /// `v1/insights/lbaas/high_http_request_response_time`, `v1/insights/lbaas/high_http_request_response_time_50p`,
        /// `v1/insights/lbaas/high_http_request_response_time_95p`, `v1/insights/lbaas/high_http_request_response_time_99p`,
        /// `v1/dbaas/alerts/load_15_alerts`, `v1/dbaas/alerts/cpu_alerts`, `v1/dbaas/alerts/memory_utilization_alerts`, or
        /// `v1/dbaas/alerts/disk_utilization_alerts`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// The uuid of the alert.
        /// </summary>
        [Output("uuid")]
        public Output<string> Uuid { get; private set; } = null!;

        /// <summary>
        /// The value to start alerting at, e.g., 90% or 85Mbps. This is a floating-point number.
        /// DigitalOcean will show the correct unit in the web panel.
        /// </summary>
        [Output("value")]
        public Output<double> Value { get; private set; } = null!;

        /// <summary>
        /// The time frame of the alert. Either `5m`, `10m`, `30m`, or `1h`.
        /// </summary>
        [Output("window")]
        public Output<string> Window { get; private set; } = null!;


        /// <summary>
        /// Create a MonitorAlert resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MonitorAlert(string name, MonitorAlertArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/monitorAlert:MonitorAlert", name, args ?? new MonitorAlertArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MonitorAlert(string name, Input<string> id, MonitorAlertState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/monitorAlert:MonitorAlert", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing MonitorAlert resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MonitorAlert Get(string name, Input<string> id, MonitorAlertState? state = null, CustomResourceOptions? options = null)
        {
            return new MonitorAlert(name, id, state, options);
        }
    }

    public sealed class MonitorAlertArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// How to send notifications about the alerts. This is a list with one element, .
        /// Note that for Slack, the DigitalOcean app needs to have permissions for your workspace. You can
        /// read more in [Slack's documentation](https://slack.com/intl/en-dk/help/articles/222386767-Manage-app-installation-settings-for-your-workspace)
        /// </summary>
        [Input("alerts", required: true)]
        public Input<Inputs.MonitorAlertAlertsArgs> Alerts { get; set; } = null!;

        /// <summary>
        /// The comparison for `value`.
        /// This may be either `GreaterThan` or `LessThan`.
        /// </summary>
        [Input("compare", required: true)]
        public Input<string> Compare { get; set; } = null!;

        /// <summary>
        /// The description of the alert.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// The status of the alert.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("entities")]
        private InputList<string>? _entities;

        /// <summary>
        /// A list of IDs for the resources to which the alert policy applies.
        /// </summary>
        public InputList<string> Entities
        {
            get => _entities ?? (_entities = new InputList<string>());
            set => _entities = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tags. When an included tag is added to a resource, the alert policy will apply to it.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The type of the alert.
        /// This may be one of `v1/insights/droplet/load_1`, `v1/insights/droplet/load_5`, `v1/insights/droplet/load_15`,
        /// `v1/insights/droplet/memory_utilization_percent`, `v1/insights/droplet/disk_utilization_percent`,
        /// `v1/insights/droplet/cpu`, `v1/insights/droplet/disk_read`, `v1/insights/droplet/disk_write`,
        /// `v1/insights/droplet/public_outbound_bandwidth`, `v1/insights/droplet/public_inbound_bandwidth`,
        /// `v1/insights/droplet/private_outbound_bandwidth`, `v1/insights/droplet/private_inbound_bandwidth`,
        /// `v1/insights/lbaas/avg_cpu_utilization_percent`, `v1/insights/lbaas/connection_utilization_percent`,
        /// `v1/insights/lbaas/droplet_health`, `v1/insights/lbaas/tls_connections_per_second_utilization_percent`,
        /// `v1/insights/lbaas/increase_in_http_error_rate_percentage_5xx`, `v1/insights/lbaas/increase_in_http_error_rate_percentage_4xx`,
        /// `v1/insights/lbaas/increase_in_http_error_rate_count_5xx`, `v1/insights/lbaas/increase_in_http_error_rate_count_4xx`,
        /// `v1/insights/lbaas/high_http_request_response_time`, `v1/insights/lbaas/high_http_request_response_time_50p`,
        /// `v1/insights/lbaas/high_http_request_response_time_95p`, `v1/insights/lbaas/high_http_request_response_time_99p`,
        /// `v1/dbaas/alerts/load_15_alerts`, `v1/dbaas/alerts/cpu_alerts`, `v1/dbaas/alerts/memory_utilization_alerts`, or
        /// `v1/dbaas/alerts/disk_utilization_alerts`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// The value to start alerting at, e.g., 90% or 85Mbps. This is a floating-point number.
        /// DigitalOcean will show the correct unit in the web panel.
        /// </summary>
        [Input("value", required: true)]
        public Input<double> Value { get; set; } = null!;

        /// <summary>
        /// The time frame of the alert. Either `5m`, `10m`, `30m`, or `1h`.
        /// </summary>
        [Input("window", required: true)]
        public Input<string> Window { get; set; } = null!;

        public MonitorAlertArgs()
        {
        }
        public static new MonitorAlertArgs Empty => new MonitorAlertArgs();
    }

    public sealed class MonitorAlertState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// How to send notifications about the alerts. This is a list with one element, .
        /// Note that for Slack, the DigitalOcean app needs to have permissions for your workspace. You can
        /// read more in [Slack's documentation](https://slack.com/intl/en-dk/help/articles/222386767-Manage-app-installation-settings-for-your-workspace)
        /// </summary>
        [Input("alerts")]
        public Input<Inputs.MonitorAlertAlertsGetArgs>? Alerts { get; set; }

        /// <summary>
        /// The comparison for `value`.
        /// This may be either `GreaterThan` or `LessThan`.
        /// </summary>
        [Input("compare")]
        public Input<string>? Compare { get; set; }

        /// <summary>
        /// The description of the alert.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The status of the alert.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("entities")]
        private InputList<string>? _entities;

        /// <summary>
        /// A list of IDs for the resources to which the alert policy applies.
        /// </summary>
        public InputList<string> Entities
        {
            get => _entities ?? (_entities = new InputList<string>());
            set => _entities = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tags. When an included tag is added to a resource, the alert policy will apply to it.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The type of the alert.
        /// This may be one of `v1/insights/droplet/load_1`, `v1/insights/droplet/load_5`, `v1/insights/droplet/load_15`,
        /// `v1/insights/droplet/memory_utilization_percent`, `v1/insights/droplet/disk_utilization_percent`,
        /// `v1/insights/droplet/cpu`, `v1/insights/droplet/disk_read`, `v1/insights/droplet/disk_write`,
        /// `v1/insights/droplet/public_outbound_bandwidth`, `v1/insights/droplet/public_inbound_bandwidth`,
        /// `v1/insights/droplet/private_outbound_bandwidth`, `v1/insights/droplet/private_inbound_bandwidth`,
        /// `v1/insights/lbaas/avg_cpu_utilization_percent`, `v1/insights/lbaas/connection_utilization_percent`,
        /// `v1/insights/lbaas/droplet_health`, `v1/insights/lbaas/tls_connections_per_second_utilization_percent`,
        /// `v1/insights/lbaas/increase_in_http_error_rate_percentage_5xx`, `v1/insights/lbaas/increase_in_http_error_rate_percentage_4xx`,
        /// `v1/insights/lbaas/increase_in_http_error_rate_count_5xx`, `v1/insights/lbaas/increase_in_http_error_rate_count_4xx`,
        /// `v1/insights/lbaas/high_http_request_response_time`, `v1/insights/lbaas/high_http_request_response_time_50p`,
        /// `v1/insights/lbaas/high_http_request_response_time_95p`, `v1/insights/lbaas/high_http_request_response_time_99p`,
        /// `v1/dbaas/alerts/load_15_alerts`, `v1/dbaas/alerts/cpu_alerts`, `v1/dbaas/alerts/memory_utilization_alerts`, or
        /// `v1/dbaas/alerts/disk_utilization_alerts`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The uuid of the alert.
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        /// <summary>
        /// The value to start alerting at, e.g., 90% or 85Mbps. This is a floating-point number.
        /// DigitalOcean will show the correct unit in the web panel.
        /// </summary>
        [Input("value")]
        public Input<double>? Value { get; set; }

        /// <summary>
        /// The time frame of the alert. Either `5m`, `10m`, `30m`, or `1h`.
        /// </summary>
        [Input("window")]
        public Input<string>? Window { get; set; }

        public MonitorAlertState()
        {
        }
        public static new MonitorAlertState Empty => new MonitorAlertState();
    }
}
